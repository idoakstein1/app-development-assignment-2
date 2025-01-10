package com.example.app_development_assignment_2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app_development_assignment_2.R
import com.example.app_development_assignment_2.model.Student

class StudentsRecyclerAdapter(private val students: ArrayList<Student>) : RecyclerView.Adapter<StudentsViewHolder>() {
    override fun getItemCount(): Int = students.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsViewHolder {
        val inflation = LayoutInflater.from(parent.context)
        val view = inflation.inflate(R.layout.student_list_row, parent, false)

        return StudentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentsViewHolder, position: Int) {
        holder.bind(students[position], position)
    }
}