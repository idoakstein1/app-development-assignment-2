package com.example.app_development_assignment_2

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_development_assignment_2.model.Student


class StudentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_student_details)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val studentNameTextView =
            findViewById<TextView>(R.id.student_details_activity_name_text_view)
        val studentIdTextView = findViewById<TextView>(R.id.student_details_activity_id_text_view)
        val studentPhoneTextView =
            findViewById<TextView>(R.id.student_details_activity_phone_text_view)
        val studentAddressTextView =
            findViewById<TextView>(R.id.student_details_activity_address_text_view)
        val studentCheckedCheckBox =
            findViewById<CheckBox>(R.id.student_details_activity_checked_check_box)

        val student = intent.getSerializableExtra("student") as? Student

        student?.let {

            studentNameTextView.text = studentNameTextView.text.toString() + it.name
            studentIdTextView.text = studentIdTextView.text.toString() + it.id
            studentPhoneTextView.text = studentPhoneTextView.text.toString() + it.phone
            studentAddressTextView.text = studentAddressTextView.text.toString() + it.address
            studentCheckedCheckBox.isChecked = it.isChecked
        }
    }

}