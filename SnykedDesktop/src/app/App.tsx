import "./App.css";
import FileList from "../components/file-list/file-list";
import FileInfo from "../types/file-info";
import SharedFileList from "../types/shared-file-list";

function App() {
  let fileList = new SharedFileList()

  fileList.add_file(
    {
      name: "File1",
      path: "Path Not Provided",
      last_synced_ms: Date.now()
    })

  fileList.add_file(
    {
      name: "File2",
      path: "Path Not Provided",
      last_synced_ms: Date.now()
    })

  return (
    <main>
      <FileList shared_files={fileList} />
    </main>
  );
}

export default App;
