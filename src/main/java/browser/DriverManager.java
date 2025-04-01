package browser;

import org.openqa.selenium.WebDriver;

public interface DriverManager {
    WebDriver startDriver();
    void stopDriver();
}