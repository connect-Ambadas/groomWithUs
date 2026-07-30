package com.connectus.app.android.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.connectus.app.android.ui.themeStyle.GroomThemeColor
import com.connectus.app.android.ui.themeStyle.GroomThemeDimens
import com.connectus.app.android.ui.themeStyle.GroomThemeShape

@Composable
fun GroomButton(

    text: String,

    onClick: () -> Unit,

    modifier: Modifier = Modifier,

    enabled: Boolean = true,

    backgroundColor: Color = GroomThemeColor.ButtonPrimaryBackground,

    contentColor: Color = GroomThemeColor.ButtonPrimaryText,

    disabledBackgroundColor: Color = ButtonDefaults.buttonColors().disabledContainerColor,

    disabledContentColor: Color = ButtonDefaults.buttonColors().disabledContentColor,

    borderColor: Color = Color.Black,

    borderWidth: Dp = 0.dp,

    height: Dp =  GroomThemeDimens.ButtonHeight,

    shape: RoundedCornerShape = GroomThemeShape.Pill,

    textStyle: TextStyle = MaterialTheme.typography.labelLarge,

    elevation: Dp = GroomThemeDimens.CardElevation
) {

    Button(

        onClick = onClick,

        enabled = enabled,

        modifier = modifier
            .fillMaxWidth()
            .height(height),

        shape = shape,

        border = BorderStroke(
            borderWidth,
            borderColor
        ),

        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = elevation
        ),

        colors = ButtonDefaults.buttonColors(

            containerColor = backgroundColor,

            contentColor = contentColor,

            disabledContainerColor = disabledBackgroundColor,

            disabledContentColor = disabledContentColor

        )

    ) {

        Text(

            text = text,

            style = textStyle

        )
    }
}