package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import config.AppConfig;

public interface Browser {
    void initialize(AppConfig appConfig);
    void openUrl(String url);
    WebElement findElement(By by);
    void quit();
}
