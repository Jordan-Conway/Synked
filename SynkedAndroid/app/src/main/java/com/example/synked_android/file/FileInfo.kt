package com.example.synked_android.file

import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

class FileInfo {
    var name: String = ""
    var path: String = ""
    var lastSyncedMs: Int = 0

    constructor(name: String, path: String, lastSynced: Int) {
        this.name = name
        this.path = path
        this.lastSyncedMs = lastSynced
    }

    fun getLastSynced(): Instant {
        return Instant.ofEpochMilli(lastSyncedMs.toLong())
    }

    fun getLastSyncedAsString(): String {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneOffset.UTC)
        return formatter.format(this.getLastSynced())
    }
}