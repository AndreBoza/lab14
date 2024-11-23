package com.example.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.josuerdx.lab14.ui.theme.Lab14Theme

class HistoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab14Theme {
                HistoryScreen()
            }
        }
    }
}

@Composable
fun HistoryScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(), // Ocupa todo el espacio disponible
        contentAlignment = Alignment.Center // Centra el contenido
    ) {
        Text(text = "Aquí se mostrará el historial")
    }
}
