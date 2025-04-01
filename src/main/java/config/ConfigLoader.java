package config;

import utils.ArgsParser;

public class ConfigLoader {
    private AppConfig appConfig;

    public ConfigLoader(String[] arguments) {
        appConfig = new AppConfig(Settings.EDGE_DRIVER_PATH, new ArgsParser().parseArgs(arguments));
    }

    public AppConfig loadConfiguration() {
        return appConfig;
    }
}