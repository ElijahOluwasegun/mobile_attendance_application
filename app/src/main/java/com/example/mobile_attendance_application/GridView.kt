package com.example.mobile_attendance_application

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GridView : AppCompatActivity() {

    // NOTE: You must add a default drawable named 'ic_course_default' to R.drawable
    // or replace it with your actual course icon IDs.
    private val DEFAULT_ICON = R.drawable.ic_course_default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        val courseGridView: GridView = findViewById(R.id.course_grid_view)

        // Prepare the Data (10 course names and icons)
        val courses = listOf(
            CourseModel("BIT - Bachelors of Information Technology", R.drawable.information_technology),
            CourseModel("BBA - Bachelors of Business Administration", R.drawable.business_administration),
            CourseModel("LLB - Law", R.drawable.law),
            CourseModel("BSE - Bachelors of Science in Software Engineering", R.drawable.software_engineering2),
            CourseModel("BCS - Bachelors of Science in Computer Science", R.drawable.computer_science2),
            CourseModel("BDSA - Bachelors Data Science and Artificial Intelligence", R.drawable.data_science),
            CourseModel("BJCS - Bachelors of Journalism and Communication Studies", R.drawable.journalism),
            CourseModel("BPH - Bachelor of Science in Public Health", R.drawable.public_health),
            CourseModel("BIRDS - Bachelor of International Relations and Diplomatic Studies", R.drawable.international_relations),
            CourseModel("BPAM - Bachelors of Public Administration & Management", R.drawable.public_admin_management2)
        )

        // Set the Adapter
        val adapter = GridViewAdapter(this, courses)
        courseGridView.adapter = adapter

        // Handle Grid Item Clicks (Navigation to Attendance Functionality)
        courseGridView.setOnItemClickListener { parent, view, position, id ->
            val selectedCourse = courses[position]
            Toast.makeText(this, "Navigating to Attendance for: ${selectedCourse.name}", Toast.LENGTH_SHORT).show()
            // Here, you would start the next activity (e.g., AttendanceActivity)
        }
    }
}