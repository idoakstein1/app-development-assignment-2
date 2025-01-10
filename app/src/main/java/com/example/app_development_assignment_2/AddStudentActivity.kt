package com.example.app_development_assignment_2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_development_assignment_2.model.Model
import com.example.app_development_assignment_2.model.Student

class AddStudentActivity : AppCompatActivity() {
    private lateinit var nameTextField: EditText
    private lateinit var idTextField: EditText
    private lateinit var phoneTextField: EditText
    private lateinit var addressTextField: EditText
    private lateinit var isCheckedCheckBox: CheckBox
    private lateinit var saveButton: Button
    private lateinit var cancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_student)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nameTextField = findViewById(R.id.add_student_activity_name_edit_text)
        idTextField = findViewById(R.id.add_student_activity_id_edit_text)
        phoneTextField = findViewById(R.id.add_student_activity_phone_edit_text)
        addressTextField = findViewById(R.id.add_student_activity_address_edit_text)
        isCheckedCheckBox = findViewById(R.id.add_student_activity_checked_checkbox)
        saveButton = findViewById(R.id.add_student_activity_save_button)
        cancelButton = findViewById(R.id.add_student_activity_cancel_button)
        saveButton.setOnClickListener(::onSave)
        cancelButton.setOnClickListener(::onCancel)
    }

    private fun onSave(view: View) {
        val name = nameTextField.text.toString()
        val id = idTextField.text.toString()
        val phone = phoneTextField.text.toString()
        val address = addressTextField.text.toString()
        val isChecked = isCheckedCheckBox.isChecked

        val student = Student(name, id, phone, address, isChecked)
        Model.shared.students.add(student)

        finish()
    }

    private fun onCancel(view: View) {
        finish()
    }
}