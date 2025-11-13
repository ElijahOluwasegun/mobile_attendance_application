package com.example.mobile_attendance_application

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ModuleActivity : AppCompatActivity() {

    private lateinit var semesterSpinner: Spinner
    private lateinit var checkboxContainer: LinearLayout
    private lateinit var submitButton: Button

    // Tracks the current list of CheckBoxes added to the container
    private val currentCheckBoxes = mutableListOf<CheckBox>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)

        semesterSpinner = findViewById(R.id.semester_spinner)
        checkboxContainer = findViewById(R.id.checkbox_container)
        submitButton = findViewById(R.id.btn_submit_modules)

        setupSpinner()
        setupSubmitButton()
    }

    private fun setupSpinner() {
        // Use the list of semester options from the ModuleData object
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            ModuleData.semesterOptions
        )
        semesterSpinner.adapter = adapter

        // Set up the listener to dynamically load modules when a semester is selected
        semesterSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedSemester = parent.getItemAtPosition(position).toString()
                loadModulesForSemester(selectedSemester)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do nothing
            }
        }
    }

    private fun loadModulesForSemester(semester: String) {
        // 1. Clear previous checkboxes
        checkboxContainer.removeAllViews()
        currentCheckBoxes.clear()

        // 2. Get the list of modules for the selected semester
        val modules = ModuleData.moduleMap[semester] ?: return // Exit if no modules found

        // 3. Dynamically create and add a CheckBox for each module
        for (module in modules) {
            val checkBox = CheckBox(this).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                text = module.title
                textSize = 16f
                // Apply custom styling/padding if needed
                setPadding(8, 16, 8, 16)
            }
            checkboxContainer.addView(checkBox)
            currentCheckBoxes.add(checkBox)
        }
    }

    private fun setupSubmitButton() {
        submitButton.setOnClickListener {
            val selectedSemester = semesterSpinner.selectedItem.toString()
            val submittedModules = getSubmittedModules()

            if (submittedModules.isEmpty()) {
                Toast.makeText(this, "Please select at least one module you attended.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // --- Submission Logic ---
            val resultMessage = "Attendance submitted for: $selectedSemester.\nModules: ${submittedModules.joinToString(", ")}"
            Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show()

            // Move to the next screen (replace NextActivity::class.java with your actual destination)
            val intent = Intent(this, RegisteredStudentActivity::class.java).apply {
                // Pass the selected data to the next activity
                putExtra("SELECTED_SEMESTER", selectedSemester)
                putStringArrayListExtra("ATTENDED_MODULES", ArrayList(submittedModules))
            }
            startActivity(intent)
        }
    }

    // Helper function to collect all checked modules
    private fun getSubmittedModules(): List<String> {
        return currentCheckBoxes
            .filter { it.isChecked }
            .map { it.text.toString() }
    }
}

// NOTE: You must create an empty 'NextActivity.kt' to run this code without errors.
// class NextActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); /* ... */ } }
