use synked_service_data::Config;

fn main() {
    let cfg = load_config("../config.json");

    println!("{}", cfg.address);
}

fn load_config(path: &str) -> Config{
    // TODO: Handle the config file being locked / not existing
    let contents = std::fs::read_to_string(path).expect("Config file could not be loaded");

    let cfg: Config = serde_json::from_str(&contents).expect("Malformed json found");

    return cfg;
}
