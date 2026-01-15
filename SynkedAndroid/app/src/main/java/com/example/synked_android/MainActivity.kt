package com.example.synked_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.synked_android.file.FileAdapter
import com.example.synked_android.file.FileInfo
import com.example.synked_android.file.SharedFileList
import java.util.Date

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedFiles = SharedFileList()
        sharedFiles.addFile(FileInfo("File 1", "No Path Provided", 0))
        sharedFiles.addFile(FileInfo("File 2", "No Path Provided", 0))

        val adapter = FileAdapter(sharedFiles.getFiles())

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}