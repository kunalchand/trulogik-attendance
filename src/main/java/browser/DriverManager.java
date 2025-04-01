package browser;

import config.AppConfig;
import org.openqa.selenium.WebDriver;

public interface DriverManager {
    WebDriver startDriver(AppConfig appConfig);
    void stopDriver();
}