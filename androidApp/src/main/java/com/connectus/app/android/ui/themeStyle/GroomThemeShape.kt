package com.connectus.app.android.ui.themeStyle

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * ----------------------------------------------------
 * Corner Radius
 * ----------------------------------------------------
 */

object GroomThemeShape {

    /** No Radius */
    val None = RoundedCornerShape(0.dp)

    /** Extra Small */
    val ExtraSmall = RoundedCornerShape(2.dp)

    /** Small */
    val Small = RoundedCornerShape(4.dp)

    /** Medium (Most Used) */
    val Medium = RoundedCornerShape(8.dp)

    /** Large */
    val Large = RoundedCornerShape(12.dp)

    /** Extra Large */
    val ExtraLarge = RoundedCornerShape(16.dp)

    /** Huge */
    val Huge = RoundedCornerShape(24.dp)

    /** Pill Buttons */
    val Pill = RoundedCornerShape(50)

    /** Circle */
    val Circle = RoundedCornerShape(50)
}

/**
 * ----------------------------------------------------
 * Material 3 Shapes
 * ----------------------------------------------------
 */

val AppShapes = Shapes(

    extraSmall = GroomThemeShape.ExtraSmall,

    small = GroomThemeShape.Small,

    medium = GroomThemeShape.Medium,

    large = GroomThemeShape.Large,

    extraLarge = GroomThemeShape.ExtraLarge
)