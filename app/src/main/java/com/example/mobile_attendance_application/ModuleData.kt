package com.example.mobile_attendance_application

// Data class to hold the module title and the year/semester it belongs to
data class Module(val title: String)

// Static object to store the course structure
object ModuleData {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Introduction to Information and Communication Technologies"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Fundamentals of Information Systems"),
            Module("Discrete Mathematics"),
            Module("Basic Statistics")
        ),
        "Year 1, Semester 2" to listOf(
            Module("Internet Technology & Web Design"),
            Module("Computer Applications"),
            Module("Database Development and Management 1"),
            Module("Principles of programming"),
            Module("Information Systems Management"),
            Module("E-Commerce")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Systems Analysis and Design"),
            Module("Object oriented programming"),
            Module("Database Development and Management 1"),
            Module("Entrepreneurship & Small Business Management"),
            Module("Web Development and Management"),
            Module("Computer Networks & Data Communications")
        ),
        "Year 2, Semester 2" to listOf(
            Module("Operating Systems Principles"),
            Module("Software Engineering Principles"),
            Module("Emerging Trends in Information Technology"),
            Module("Computer Repair and Maintenance"),
            Module("Research Methodology in Computing"),
        ),
        "Year 3, Semester 1" to listOf(
            Module("ICT Project Planning and Management"),
            Module("Business Systems Modelling"),
            Module("Multimedia systems"),
            Module("Mobile Application Development"),
            Module("Network Configuration and Management")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Professional Issues in Computing"),
            Module("Information Systems Audit"),
            Module("Distributed System Development"),
            Module("Network and Information Security"),
            Module("User Interface Design")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}
