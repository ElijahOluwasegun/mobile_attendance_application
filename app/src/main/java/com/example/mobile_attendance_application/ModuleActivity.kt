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
import android.widget.TextView // Add this import
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ModuleActivity : AppCompatActivity() {

    private lateinit var semesterSpinner: Spinner
    private lateinit var checkboxContainer: LinearLayout
    private lateinit var submitButton: Button

    // Hold the data map for the selected course
    private var currentModuleMap: Map<String, List<Module>> = ModuleData.moduleMap
    private lateinit var semesterOptions: List<String>
    private lateinit var selectedCourseName: String

    // Tracks the current list of CheckBoxes added to the container
    private val currentCheckBoxes = mutableListOf<CheckBox>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)

        // 1. Get the course name passed from GridView.kt
        selectedCourseName = intent.getStringExtra("EXTRA_COURSE_NAME") ?: "Course Modules"

        // Use a simple switch statement to set the correct module data map
        when {
            selectedCourseName.startsWith("BIT") -> {
                currentModuleMap = ModuleData.moduleMap
            }
            selectedCourseName.startsWith("BBA") -> {
                currentModuleMap = ModuleDataBBA.moduleMap
            }
            selectedCourseName.startsWith("LLB") -> {
                currentModuleMap = ModuleDataLLB.moduleMap
            }
            selectedCourseName.startsWith("BSE") -> {
                currentModuleMap = ModuleDataBSE.moduleMap
            }
            selectedCourseName.startsWith("BCS") -> {
                currentModuleMap = ModuleDataBCS.moduleMap
            }
            selectedCourseName.startsWith("BDSA") -> {
                currentModuleMap = ModuleDataBDSA.moduleMap
            }
            selectedCourseName.startsWith("BJCS") -> {
                currentModuleMap = ModuleDataBJCS.moduleMap
            }
            selectedCourseName.startsWith("BPH") -> {
                currentModuleMap = ModuleDataBPH.moduleMap
            }
            selectedCourseName.startsWith("BIRDS") -> {
                currentModuleMap = ModuleDataBIRDS.moduleMap
            }
            selectedCourseName.startsWith("BPAM") -> {
                currentModuleMap = ModuleDataBPAM.moduleMap
            }
            // Add more cases for other courses here (e.g., "LLB", "BSE", etc.)
            // Example: selectedCourseName.startsWith("LLB") -> { currentModuleMap = ModuleDataLLB.moduleMap }
            else -> {
                // Fallback or a Toast error if the course isn't mapped
                currentModuleMap = ModuleData.moduleMap
                Toast.makeText(this, "Module data not found for $selectedCourseName, showing default BIT modules.", Toast.LENGTH_LONG).show()
            }
        }
        semesterOptions = currentModuleMap.keys.toList()

        // Update the screen title to reflect the selected course
        val titleTextView: TextView = findViewById(R.id.title_text_view) // Assuming you add this ID to your title TextView in XML
        // If you don't want to change the title, skip this line.
        // titleTextView.text = "Modules for: ${selectedCourseName.substringBefore(" - ")}"

        semesterSpinner = findViewById(R.id.semester_spinner)
        checkboxContainer = findViewById(R.id.checkbox_container)
        submitButton = findViewById(R.id.btn_submit_modules)

        setupSpinner()
        setupSubmitButton()
    }

    private fun setupSpinner() {
        // Use the list of semester options from the dynamically set currentModuleMap
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            semesterOptions
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

        // 2. Get the list of modules from the current module map
        val modules = currentModuleMap[semester] ?: return

        // 3. Dynamically create and add a CheckBox for each module
        for (module in modules) {
            val checkBox = CheckBox(this).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                text = module.title
                textSize = 16f
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
            val resultMessage = "Attendance submitted for: $selectedCourseName - $selectedSemester.\nModules: ${submittedModules.joinToString(", ")}"
            Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show()

            // Move to the next screen
            val intent = Intent(this, RegisteredStudentActivity::class.java).apply {
                putExtra("SELECTED_COURSE", selectedCourseName)
                putExtra("SELECTED_SEMESTER", selectedSemester)
                putStringArrayListExtra("ATTENDED_MODULES", ArrayList(submittedModules))
            }
            startActivity(intent)
            finish()
        }
    }

    private fun getSubmittedModules(): List<String> {
        return currentCheckBoxes
            .filter { it.isChecked }
            .map { it.text.toString() }
    }
}