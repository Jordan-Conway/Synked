use serde::{ Serialize, Deserialize };
use std::{error::Error, fs::{OpenOptions}, io::Write};

use crate::{FileInfo};

#[derive(Debug, Serialize, Deserialize)]
pub struct SharedFileList{
    files: Vec<FileInfo>
}

impl SharedFileList {
    pub fn new() -> Self{
        SharedFileList { files: Vec::new() }
    }

    pub fn add_file_info(&mut self, file_info: FileInfo){
        self.files.push(file_info);
    }

    pub fn get_files(&self) -> Vec<FileInfo> {
        return self.files.to_vec();
    }

    pub fn output_to_file(&self, path: &str) -> Result<(), Box<dyn Error>> {
        let mut file = OpenOptions::new().write(true).create(true).truncate(true).open(path)?;
        let serialized = serde_json::to_string(self)?;

        let result = file.write_all(serialized.as_bytes());

        return Ok(result?);
    }
}