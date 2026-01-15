use synked_service_data::{Config, SharedFileList, FileInfo};
use uuid::Uuid;

fn main() {
    let cfg = load_config("../config.json");

    println!("{}", cfg.address);

    let file = FileInfo {
        id: Uuid::new_v4(),
        name: "Test".to_string(),
        path: "../test.txt".to_string(),
        last_synced_ms: chrono::DateTime::from_timestamp_millis(0).unwrap()
    };

    dbg!(&file);

    let mut file_list = SharedFileList::new();

    file_list.add_file_info(file);

    dbg!(file_list.get_files());

    let _ = file_list.output_to_file("../output.json");

}

fn load_config(path: &str) -> Config{
    // TODO: Handle the config file being locked / not existing
    let contents = std::fs::read_to_string(path).expect("Config file could not be loaded");

    let cfg: Config = serde_json::from_str(&contents).expect("Malformed json found");

    return cfg;
}
