package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface PageInteractor {
    void openUrl(String url);
    WebElement findElement(By by);
}
