package utils;

public class ArgsParser {
    public boolean parseArgs() {
        String[] args = new String[0]; // In a real app, you'd get args from main()
        
        if (args.length > 0) {
            if ("-o".equals(args[0])) {
                return true;
            } else if ("-c".equals(args[0])) {
                return false;
            } else {
                System.out.println("Invalid argument provided, shutting down the application...");
                System.exit(1);
            }
        }
        return false;
    }
}
