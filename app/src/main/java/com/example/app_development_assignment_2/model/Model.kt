package com.example.app_development_assignment_2.model

class Model private constructor() {
    val students = ArrayList<Student>()

    companion object {
        val shared = Model()
    }

    init {
        for (i in 1..20) {
            students.add(Student(name = "Student $i", id = "Id $i", phone = "Phone $i", address = "Address $i"))
        }
    }
}