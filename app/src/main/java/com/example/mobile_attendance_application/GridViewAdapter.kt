package com.example.mobile_attendance_application

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridViewAdapter(private val context: Context, private val courseList: List<CourseModel>) : BaseAdapter() {

    override fun getCount(): Int = courseList.size

    override fun getItem(position: Int): Any = courseList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val course = courseList[position]
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            // Inflate the layout
            view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // Bind data
        viewHolder.courseName.text = course.name
        viewHolder.courseImage.setImageResource(course.imageResId)

        return view
    }

    private class ViewHolder(view: View) {
        val courseName: TextView = view.findViewById(R.id.course_name)
        val courseImage: ImageView = view.findViewById(R.id.course_image)
    }
}