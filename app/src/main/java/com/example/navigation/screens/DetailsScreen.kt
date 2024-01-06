package com.example.navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigation.navigation.NavScreen

@Composable
fun DetailsScreen(navController: NavController, name: String, age: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Name: $name",
            fontSize = 40.sp
        )
        Text(
            text = "age: $age",
            fontSize = 40.sp
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(
            onClick = {
                navController.navigate(NavScreen.LastScreen.route)
            }
        ) {
            Text(
                text = "Go to Last Screen",
                fontSize = 30.sp
            )
        }
    }
}