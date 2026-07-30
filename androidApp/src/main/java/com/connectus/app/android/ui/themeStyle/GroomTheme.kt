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
    primary = GroomThemeColor.BrandPrimary,
    onPrimary = GroomThemeColor.TextOnPrimary,
    primaryContainer = GroomThemeColor.BrandPrimaryLight,
    onPrimaryContainer = GroomThemeColor.TextPrimary,

    secondary = GroomThemeColor.BrandSecondary,
    onSecondary = GroomThemeColor.TextOnSecondary,
    secondaryContainer = GroomThemeColor.BrandSecondaryLight,
    onSecondaryContainer = GroomThemeColor.TextPrimary,

    tertiary = GroomThemeColor.BrandTertiary,

    background = GroomThemeColor.Background,
    onBackground = GroomThemeColor.TextPrimary,

    surface = GroomThemeColor.Surface,
    onSurface = GroomThemeColor.TextPrimary,
    surfaceVariant = GroomThemeColor.SurfaceVariant,
    onSurfaceVariant = GroomThemeColor.TextSecondary,

    error = GroomThemeColor.Error,
    onError = GroomThemeColor.TextOnError,
    errorContainer = GroomThemeColor.ErrorContainer,
    onErrorContainer = GroomThemeColor.Error,

    outline = GroomThemeColor.Border
)

/**
 * ----------------------------------------------------
 * Dark Color Scheme
 * ----------------------------------------------------
 */
private val DarkColors = darkColorScheme(
    primary = GroomThemeColor.DarkButtonPrimary,
    onPrimary = GroomThemeColor.TextPrimary,

    secondary = GroomThemeColor.BrandSecondaryLight,
    onSecondary = GroomThemeColor.TextPrimary,

    background = GroomThemeColor.DarkBackground,
    onBackground = GroomThemeColor.DarkTextPrimary,

    surface = GroomThemeColor.DarkSurface,
    onSurface = GroomThemeColor.DarkTextPrimary,

    surfaceVariant = GroomThemeColor.DarkCard,
    onSurfaceVariant = GroomThemeColor.DarkTextSecondary,

    error = GroomThemeColor.Error,
    onError = GroomThemeColor.TextOnError,

    outline = GroomThemeColor.DarkBorder
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