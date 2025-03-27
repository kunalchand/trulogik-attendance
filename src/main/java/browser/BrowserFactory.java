package browser;

public class BrowserFactory {
    public static Browser getBrowser(String browserType) {
        if (browserType.toLowerCase().equals("edge")) {
            return new EdgeBrowser();
        }
        // Future implementations can add other browsers
        throw new IllegalArgumentException("Unsupported browser type: " + browserType);
    }
}
