package com.example.app_development_assignment_2.model

class Model private constructor() {
    val students = ArrayList<Student>()

    companion object {
        val shared = Model()
    }
}