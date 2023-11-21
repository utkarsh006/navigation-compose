package com.example.navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun LoginScreen(
    email: String,
    onClick: () -> Unit
) {
    Text(
        text = "Login - $email",
        modifier = Modifier.clickable { onClick() }
    )
}