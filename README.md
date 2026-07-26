# HelloKMP

A minimal Kotlin Multiplatform (KMP) project. It shows:

- **"Hello, Android!"** when run on an Android device/emulator
- **"Hello, iOS!"** when run on an iPhone/iOS simulator

Both screens are powered by the same shared Kotlin code using `expect`/`actual`.

## Project structure

```
HelloKMP/
├── settings.gradle.kts        Gradle module list
├── build.gradle.kts           Root Gradle config (plugin versions)
├── gradle.properties
├── gradle/wrapper/            Gradle wrapper config
├── shared/                    <-- Shared KMP module (common logic)
│   └── src/
│       ├── commonMain/        Greeting.kt (expect Platform, Greeting class)
│       ├── androidMain/       Platform.android.kt -> name = "Android"
│       └── iosMain/           Platform.ios.kt     -> name = "iOS"
├── androidApp/                <-- Android app module (Jetpack Compose)
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/.../MainActivity.kt
│       └── res/values/strings.xml
└── iosApp/                    <-- iOS app source (SwiftUI)
    └── iosApp/
        ├── iOSApp.swift
        ├── ContentView.swift
        └── Info.plist
```

## How the shared logic works

`shared/src/commonMain/.../Greeting.kt`:
```kotlin
expect class Platform() {
    val name: String
}

class Greeting {
    private val platform = Platform()
    fun greet(): String = "Hello, ${platform.name}!"
}
```

- On **Android**, `Platform.android.kt` sets `name = "Android"` → screen shows **"Hello, Android!"**
- On **iOS**, `Platform.ios.kt` sets `name = "iOS"` → screen shows **"Hello, iOS!"**

## Running the Android app

1. Open **Android Studio** (Hedgehog/Iguana or newer, with the Kotlin Multiplatform plugin — usually bundled already).
2. Choose **Open** and select the unzipped `HelloKMP` folder (the one containing `settings.gradle.kts`).
3. Let Gradle sync. If prompted about the Gradle wrapper jar, click **"OK" / "Fix"** to let Android Studio download it, or run:
   ```
   gradle wrapper --gradle-version 8.5
   ```
   from the project root once (needs a local Gradle install) to regenerate `gradle/wrapper/gradle-wrapper.jar`.
4. Select the **androidApp** run configuration and pick an emulator or device.
5. Run ▶️ — you'll see **"Hello, Android!"** on screen.

> Note: for size reasons this zip doesn't include the binary `gradle-wrapper.jar`. Android Studio will regenerate/download it automatically on first sync (or use the `gradle wrapper` command above if you have Gradle installed locally).

## Running the iOS app (requires a Mac + Xcode)

Kotlin/Native's iOS framework must be built and consumed from Xcode, which only runs on macOS, so the `.xcodeproj` isn't included as a binary bundle — instead do this once on your Mac:

1. In Xcode: **File → New → Project → iOS → App**.
   - Product Name: `iosApp`
   - Interface: **SwiftUI**
   - Save it *inside* the `HelloKMP/iosApp/` folder (replacing the placeholder `iosApp` folder, or merging into it).
2. Replace the generated `iOSApp.swift`, `ContentView.swift`, and `Info.plist` with the ones provided in `iosApp/iosApp/` from this project.
3. Build the shared framework once from Terminal at the project root:
   ```
   ./gradlew :shared:embedAndSignAppleFrameworkForXcode
   ```
   (or just build the `shared` module for the target you need, e.g. `iosSimulatorArm64`).
4. In Xcode, add the generated `shared.framework` (from `shared/build/xcode-frameworks/...`) to the app target's **Frameworks, Libraries, and Embedded Content**, or (recommended) add a **Run Script build phase** that runs `embedAndSignAppleFrameworkForXcode` automatically — this is the standard KMP setup and is what the official [Kotlin Multiplatform wizard](https://kmp.jetbrains.com) generates if you'd rather start from a ready-made Xcode project.
5. Build & run on a simulator — you'll see **"Hello, iOS!"** on screen.

### Easiest alternative for iOS
If you'd rather not wire Xcode by hand, go to https://kmp.jetbrains.com, generate a project with the same package name (`com.connectus.app`) and "iOS" + "Android" targets, then drop this project's `shared/src/commonMain`, `androidMain`, and `iosMain` Kotlin files into the generated project — the wizard's `iosApp.xcodeproj` will already be correctly wired up.

## Requirements
- Android Studio (recent, with Kotlin plugin ≥ 1.9.24)
- JDK 17
- For iOS: macOS + Xcode 15+
