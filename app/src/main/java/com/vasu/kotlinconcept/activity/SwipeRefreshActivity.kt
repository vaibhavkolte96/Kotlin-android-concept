package com.vasu.kotlinconcept.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.vasu.kotlinconcept.R
import com.vasu.kotlinconcept.adapter.CourseRVAdapter
import com.vasu.kotlinconcept.model.CourseRVModal
import java.util.*
import kotlin.collections.ArrayList

class SwipeRefreshActivity : AppCompatActivity() {
    // on below line we are creating variables for our swipe
    // to refresh layout, recycler view, adapter and list.
    lateinit var swipeRefreshLayout: SwipeRefreshLayout
    lateinit var courseRV: RecyclerView
    lateinit var courseRVAdapter: CourseRVAdapter
    lateinit var courseList: ArrayList<CourseRVModal>

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_refresh)

        // on below line we are initializing our views with their ids.
        swipeRefreshLayout = findViewById(R.id.container)
        courseRV = findViewById(R.id.idRVCourses)

        // on below line we are initializing our list
        courseList = ArrayList()

        // on below line we are initializing our adapter
        courseRVAdapter = CourseRVAdapter(courseList)

        // on below line we are setting adapter to our recycler view.
        courseRV.adapter = courseRVAdapter

        // on below line we are adding data to our list
        courseList.add(CourseRVModal("Android Development", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("C++ Development", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("Java Development", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("Python Development", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("JavaScript Development", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("Android Development 1", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("C++ Development 1", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("Java Development 1", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("Python Development 1", R.drawable.sign_up_image))
        courseList.add(CourseRVModal("JavaScript Development 1", R.drawable.sign_up_image))

        // on below line we are notifying adapter
        // that data has been updated.
        courseRVAdapter.notifyDataSetChanged()

        // on below line we are adding refresh listener
        // for our swipe to refresh method.
        swipeRefreshLayout.setOnRefreshListener {

            // on below line we are setting is refreshing to false.
            swipeRefreshLayout.isRefreshing = false

            // on below line we are shuffling our list using random
            courseList.shuffle(Random(System.currentTimeMillis()))

            // on below line we are notifying adapter
            // that data has changed in recycler view.
            courseRVAdapter.notifyDataSetChanged()
        }
    }
}