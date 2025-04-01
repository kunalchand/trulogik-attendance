package utils;

public class ArgsParser {
    private Boolean keepBrowserOpen = false;

    public Boolean parseArgs(String[] args) {
        if (args.length > 0) {
            if ("-o".equals(args[0])) {
                keepBrowserOpen = true; // Keep open
            } else if ("-c".equals(args[0])) {
                keepBrowserOpen = false; // Close
            } else {
                System.out.println("Invalid argument. Use -o (keep open) or -c (close)");
                System.exit(1);
            }
        }

        return keepBrowserOpen; // Default: close
    }
}
