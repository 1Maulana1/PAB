package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstScreen()
        }
    }
}

@Composable
fun MyFirstScreen() {
    // Task 3: Menggunakan Surface dengan warna latar kustom (misal: LightGray)
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp) // Menggunakan padding pilihan akhir (24.dp)
        ) {
            // Task 1: Salam personal dan ide aplikasi
            Text(text = "Hi! I am Maulana.")
            Text(text = "My idea: A Student Task Tracker App.")

            // Task 2: Menggunakan gambar kustom dari res/drawable/my_picture.png
            Image(
                painter = painterResource(id = R.drawable.my_picture),
                contentDescription = "Profile picture of Maulana"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyFirstScreenPreview() {
    MyFirstScreen()
}