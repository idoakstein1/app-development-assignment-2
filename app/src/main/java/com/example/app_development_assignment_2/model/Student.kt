package com.example.app_development_assignment_2.model

import java.io.Serializable

data class Student (
    val name: String,
    val id: String,
    val phone: String,
    val address: String,
    var isChecked: Boolean = false
):Serializable
