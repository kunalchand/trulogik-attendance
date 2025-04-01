package browser;

import config.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager implements DriverManager {
    private WebDriver driver;

    public WebDriver startDriver(AppConfig appConfig) {
        System.setProperty("webdriver.edge.driver", appConfig.getEdgeDriverPath());
        
        driver = new EdgeDriver();
        return driver;
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
