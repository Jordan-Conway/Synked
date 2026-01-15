import "./file-list.scss"
import FileDisplay from "../file-display/file-display"
import SharedFileInfo from "../../types/shared-file-list"

type FileListProps = {
    shared_files: SharedFileInfo
}

export default function FileList({shared_files}: FileListProps)
{
    return(
        <div className="file-list">
            {shared_files.files.map(file => (
                <FileDisplay fileInfo={file}/>
            ))}
        </div>
    )
}