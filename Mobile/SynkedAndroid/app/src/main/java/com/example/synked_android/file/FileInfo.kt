package com.example.synked_android.file

import java.util.Date;

class FileInfo {
    var name: String = ""
    var path: String = ""
    var lastModified: Date = Date(0)

    constructor(name: String, path: String, lastModified: Date) {
        this.name = name
        this.path = path
        this.lastModified = lastModified
    }
}