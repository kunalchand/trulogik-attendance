package browser;

import config.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager {
    private WebDriver driver;

    public WebDriver startDriver() {
        System.setProperty("webdriver.edge.driver", ConfigLoader.getEdgeDriverPath());
        
        EdgeOptions options = new EdgeOptions();
        options.setExperimentalOption("detach", ConfigLoader.getBrowserOptions());
        
        driver = new EdgeDriver(options);
        return driver;
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
