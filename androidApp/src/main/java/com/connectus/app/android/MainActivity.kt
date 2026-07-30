package com.connectus.app.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.connectus.app.Greeting
import com.connectus.app.android.ui.component.GroomButton
import com.connectus.app.android.ui.themeStyle.GroomThemeColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloScreen()
        }
    }
}

@Composable
fun HelloScreen() {
    MaterialTheme {
        Surface {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                GroomButton(
                    text = Greeting().greet(),
                    onClick = { },
                    contentColor = GroomThemeColor.ButtonSecondaryText,
                    backgroundColor = GroomThemeColor.ButtonSecondaryBackground,
                    enabled = true,
                    borderColor = GroomThemeColor.DarkBorder,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                //Text(text = Greeting().greet(), fontSize = 28.sp)
            }
        }
    }
}

@Preview
@Composable
fun HelloScreenPreview() {
    HelloScreen()
}
