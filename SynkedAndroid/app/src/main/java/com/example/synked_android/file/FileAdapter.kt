package com.example.synked_android.file

import android.icu.text.SimpleDateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.synked_android.R
import java.util.Locale

class FileAdapter(private val fileList: List<FileInfo>) : RecyclerView.Adapter<FileAdapter.ViewHolder>() {
    companion object {
        val dateTimeFormat = SimpleDateFormat("HH:mm dd/MM/yyyy", Locale.getDefault())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.file_info_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fileInfo = fileList[position]

        holder.nameText.text = fileInfo.name
        holder.pathText.text = fileInfo.path
        holder.lastModifiedText.text = fileInfo.getLastSyncedAsString();
    }

    override fun getItemCount(): Int {
        return fileList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameText: TextView = view.findViewById(R.id.name)
        val pathText: TextView = view.findViewById(R.id.path)
        val lastModifiedText: TextView = view.findViewById(R.id.lastModified)
    }
}