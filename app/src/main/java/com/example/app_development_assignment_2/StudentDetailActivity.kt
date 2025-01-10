package com.example.app_development_assignment_2

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.app_development_assignment_2.model.Student


class StudentDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_student_detail)
        val studentNameTextView = findViewById<TextView>(R.id.studentNameTextView)
        val studentIdTextView = findViewById<TextView>(R.id.studentIdTextView)
//        val studentGradeTextView = findViewById<TextView>(R.id.studentGradeTextView)


        val student = intent.getSerializableExtra("student") as? Student
        Log.d("StudentDetailActivity", "Received student: $student")
        student?.let {

            studentNameTextView.text = it.name
            studentIdTextView.text = it.id        }
    }
}