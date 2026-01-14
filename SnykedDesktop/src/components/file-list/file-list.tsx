import "./file-list.scss"
import FileInfo from "../../types/file-info";
import FileDisplay from "../file-display/file-display"

type FileListProps = {
    files: FileInfo[]
}

export default function FileList({files}: FileListProps)
{
    return(
        <div className="file-list">
            {files.map(file => (
                <FileDisplay fileInfo={file}/>
            ))}
        </div>
    )
}