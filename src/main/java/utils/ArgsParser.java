package utils;

public class ArgsParser {
    public boolean parseArgs(String[] args) {
        if (args.length > 0) {
            if ("-o".equals(args[0])) {
                return true; // Keep open
            } else if ("-c".equals(args[0])) {
                return false; // Close
            } else {
                System.out.println("Invalid argument. Use -o (keep open) or -c (close)");
                System.exit(1);
            }
        }
        return false; // Default: close
    }
}
