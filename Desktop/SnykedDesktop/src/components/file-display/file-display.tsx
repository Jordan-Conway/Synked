import FileInfo from "../../types/file-info"

type FileDisplayProps = {
  fileInfo: FileInfo
}

export default function FileDisplay({ fileInfo }: FileDisplayProps){

    return(
        <div className="file-display">
            <span className="file-name">{fileInfo.name}</span>
            <span className="file-path">{fileInfo.path}</span>
            <span className="file-last-modified">{fileInfo.lastModified.toString()}</span>
        </div>
    );
}