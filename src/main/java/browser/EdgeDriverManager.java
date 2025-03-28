package browser;

import config.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager {
    private WebDriver driver;

    public WebDriver startDriver() {
        System.setProperty("webdriver.edge.driver", ConfigLoader.getEdgeDriverPath());
        
        driver = new EdgeDriver();
        return driver;
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
