package com.example.synked_android.file

class SharedFileList {
    private var files : MutableList<FileInfo> = mutableListOf()

    fun getFiles(): List<FileInfo> {
        return this.files
    }

    fun addFile(file: FileInfo)
    {
        this.files.add(file)
    }
}