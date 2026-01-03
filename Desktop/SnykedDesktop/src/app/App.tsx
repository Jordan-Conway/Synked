import "./App.css";
import FileList from "../components/file-list/file-list";
import FileInfo from "../types/file-info";

function App() {
  let fileList: FileInfo[] = [
    {
      name: "File1", 
      path: "Path Not Provided", 
      lastModified: new Date(0)
    },
    {
      name: "File2", 
      path: "Path Not Provided", 
      lastModified: new Date(0)
    }
  ]

  return (
    <main>
      <FileList files={fileList} />
    </main>
  );
}

export default App;
