package config;

import utils.ArgsParser;

public class ConfigLoader {
    public static String getEdgeDriverPath() {
        return Settings.EDGE_DRIVER_PATH;
    }

    public static boolean getBrowserOptions() {
        return new ArgsParser().parseArgs();
    }
}
