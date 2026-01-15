class FileInfo {
    name: string
    path: string
    last_synced_ms: Number

    constructor() {
        this.name = ""
        this.path = ""
        this.last_synced_ms = Date.UTC(0)
    }
}

export default FileInfo