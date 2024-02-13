package com.example.navigation.model

import java.io.Serializable

data class User(
    val name: String = "",
    val age: Int = 0
) : Serializable