package com.connectus.app.android.ui.themeStyle

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * ----------------------------------------------------
 * Light Color Scheme
 * ----------------------------------------------------
 */
private val LightColors = lightColorScheme(
    primary = BrandPrimary,
    onPrimary = TextOnPrimary,
    primaryContainer = BrandPrimaryLight,
    onPrimaryContainer = TextPrimary,

    secondary = BrandSecondary,
    onSecondary = TextOnSecondary,
    secondaryContainer = BrandSecondaryLight,
    onSecondaryContainer = TextPrimary,

    tertiary = BrandTertiary,

    background = Background,
    onBackground = TextPrimary,

    surface = Surface,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,

    error = Error,
    onError = TextOnError,
    errorContainer = ErrorContainer,
    onErrorContainer = Error,

    outline = Border
)

/**
 * ----------------------------------------------------
 * Dark Color Scheme
 * ----------------------------------------------------
 */
private val DarkColors = darkColorScheme(
    primary = DarkButtonPrimary,
    onPrimary = TextPrimary,

    secondary = BrandSecondaryLight,
    onSecondary = TextPrimary,

    background = DarkBackground,
    onBackground = DarkTextPrimary,

    surface = DarkSurface,
    onSurface = DarkTextPrimary,

    surfaceVariant = DarkCard,
    onSurfaceVariant = DarkTextSecondary,

    error = Error,
    onError = TextOnError,

    outline = DarkBorder
)

/**
 * ----------------------------------------------------
 * App Theme
 * ----------------------------------------------------
 */
@Composable
fun BarberShopTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context)
            else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColors
        else -> LightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}