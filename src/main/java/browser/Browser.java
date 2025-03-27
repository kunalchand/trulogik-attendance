package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Browser {
    void initialize();
    void openUrl(String url);
    WebElement findElement(By by);
    void quit();
}
