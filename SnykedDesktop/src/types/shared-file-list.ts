import FileInfo from "./file-info"

class SharedFileList {
    files: FileInfo[]

    constructor() {
        this.files = []
    }

    add_file(file_info: FileInfo){
        this.files.push(file_info)
    }
}

export default SharedFileList