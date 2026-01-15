use serde::{ Serialize, Deserialize };
use uuid::Uuid;

#[derive(Clone, Debug, Serialize, Deserialize)]
pub struct FileInfo{
    pub id: Uuid,
    pub name: String,
    pub path: String,
    pub last_synced_ms: chrono::DateTime<chrono::Utc>
}