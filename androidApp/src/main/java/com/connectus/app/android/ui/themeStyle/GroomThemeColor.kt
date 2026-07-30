package com.connectus.app.android.ui.themeStyle

import androidx.compose.ui.graphics.Color

object GroomThemeColor {

    /**
     * ----------------------------------------------------
     * Brand Colors
     * ----------------------------------------------------
     */
    val BrandPrimary = Color(0xFF2563EB)
    val BrandPrimaryDark = Color(0xFF1D4ED8)
    val BrandPrimaryLight = Color(0xFF60A5FA)

    val BrandSecondary = Color(0xFF10B981)
    val BrandSecondaryDark = Color(0xFF059669)
    val BrandSecondaryLight = Color(0xFF6EE7B7)

    val BrandTertiary = Color(0xFFF59E0B)

    /**
     * ----------------------------------------------------
     * Background
     * ----------------------------------------------------
     */
    val Background = Color(0xFFFFFFFF)
    val BackgroundSecondary = Color(0xFFF8FAFC)
    val BackgroundTertiary = Color(0xFFF1F5F9)

    val Surface = Color(0xFFFFFFFF)
    val SurfaceVariant = Color(0xFFF5F5F5)

    val CardBackground = Color(0xFFFFFFFF)

    /**
     * ----------------------------------------------------
     * Text
     * ----------------------------------------------------
     */
    val TextPrimary = Color(0xFF111827)
    val TextSecondary = Color(0xFF4B5563)
    val TextTertiary = Color(0xFF6B7280)

    val TextOnPrimary = Color.White
    val TextOnSecondary = Color.White
    val TextOnError = Color.White

    /**
     * ----------------------------------------------------
     * Button
     * ----------------------------------------------------
     */
    val ButtonPrimaryBackground = BrandPrimary
    val ButtonPrimaryText = Color.White

    val ButtonSecondaryBackground = BrandSecondary
    val ButtonSecondaryText = Color.White

    val ButtonOutlinedBorder = BrandPrimary
    val ButtonOutlinedText = BrandPrimary

    val ButtonDisabledBackground = Color(0xFFE5E7EB)
    val ButtonDisabledText = Color(0xFF9CA3AF)

    /**
     * ----------------------------------------------------
     * Icon
     * ----------------------------------------------------
     */
    val IconPrimary = TextPrimary
    val IconSecondary = TextSecondary
    val IconDisabled = Color(0xFF9CA3AF)

    /**
     * ----------------------------------------------------
     * Divider / Border
     * ----------------------------------------------------
     */
    val Divider = Color(0xFFE5E7EB)
    val Border = Color(0xFFD1D5DB)

    /**
     * ----------------------------------------------------
     * Input Field
     * ----------------------------------------------------
     */
    val TextFieldBackground = Color.White
    val TextFieldBorder = Border
    val TextFieldFocusedBorder = BrandPrimary
    val TextFieldPlaceholder = Color(0xFF9CA3AF)

    /**
     * ----------------------------------------------------
     * Status Colors
     * ----------------------------------------------------
     */
    val Success = Color(0xFF16A34A)
    val SuccessContainer = Color(0xFFDCFCE7)

    val Error = Color(0xFFDC2626)
    val ErrorContainer = Color(0xFFFEE2E2)

    val Warning = Color(0xFFF59E0B)
    val WarningContainer = Color(0xFFFEF3C7)

    val Info = Color(0xFF2563EB)
    val InfoContainer = Color(0xFFDBEAFE)

    /**
     * ----------------------------------------------------
     * Badge
     * ----------------------------------------------------
     */
    val BadgeBackground = Error
    val BadgeText = Color.White

    /**
     * ----------------------------------------------------
     * Snackbar
     * ----------------------------------------------------
     */
    val SnackbarBackground = Color(0xFF1F2937)
    val SnackbarText = Color.White

    /**
     * ----------------------------------------------------
     * Progress
     * ----------------------------------------------------
     */
    val ProgressTrack = Color(0xFFE5E7EB)
    val ProgressIndicator = BrandPrimary

    /**
     * ----------------------------------------------------
     * Navigation
     * ----------------------------------------------------
     */
    val NavigationBackground = Background
    val NavigationSelected = BrandPrimary
    val NavigationUnselected = TextSecondary

    /**
     * ----------------------------------------------------
     * Toolbar
     * ----------------------------------------------------
     */
    val ToolbarBackground = BrandPrimary
    val ToolbarContent = Color.White

    /**
     * ----------------------------------------------------
     * Bottom Sheet
     * ----------------------------------------------------
     */
    val BottomSheetBackground = Background

    /**
     * ----------------------------------------------------
     * Dialog
     * ----------------------------------------------------
     */
    val DialogBackground = Background

    /**
     * ----------------------------------------------------
     * Overlay
     * ----------------------------------------------------
     */
    val Scrim = Color(0x80000000)

    /**
     * ----------------------------------------------------
     * Dark Theme
     * ----------------------------------------------------
     */
    val DarkBackground = Color(0xFF121212)
    val DarkSurface = Color(0xFF1E1E1E)
    val DarkCard = Color(0xFF242424)

    val DarkTextPrimary = Color.White
    val DarkTextSecondary = Color(0xFFB3B3B3)

    val DarkBorder = Color(0xFF333333)

    val DarkButtonPrimary = BrandPrimaryLight
}