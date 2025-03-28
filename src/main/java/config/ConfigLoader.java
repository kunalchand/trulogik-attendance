package config;

import utils.ArgsParser;

public class ConfigLoader {
    private static String[] args;

    public static void init(String[] arguments) {
        args = arguments;
    }

    public static String getEdgeDriverPath() {
        return Settings.EDGE_DRIVER_PATH;
    }

    public static boolean getBrowserOpenStatus() {
        return new ArgsParser().parseArgs(args);
    }
}