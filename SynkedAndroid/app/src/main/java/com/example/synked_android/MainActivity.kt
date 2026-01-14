package com.example.synked_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.synked_android.file.FileAdapter
import com.example.synked_android.file.FileInfo
import java.util.Date

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = arrayOf(
            FileInfo("File 1", "No Path Provided", Date(9)),
            FileInfo("File 2", "No Path Provided", Date(9))
        )

        val adapter = FileAdapter(dataSet)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}