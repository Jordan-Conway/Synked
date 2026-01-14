use serde::{Serialize, Deserialize};

#[derive(Debug, Serialize, Deserialize)]
pub struct Config { 
    pub address: String, 
    pub port : u32, 
} 

impl Config { 
    pub fn get_address(&self) -> String { 
        format!("{}:{}", self.address, self.port) 
    } 
}