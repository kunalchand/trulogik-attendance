package browser;

import exceptions.BrowserException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EdgeBrowser implements Browser {
    private EdgeDriverManager edgeDriverManager;
    private WebDriver driver;
    private EdgePageInteractor page;

    public EdgeBrowser() {
        this.edgeDriverManager = new EdgeDriverManager();
        this.driver = null;
        this.page = null;
    }

    @Override
    public void initialize() {
        try {
            this.driver = edgeDriverManager.startDriver();
            this.page = new EdgePageInteractor(driver);
        } catch (Exception e) {
            throw new BrowserException("Failed to initialize Edge browser", e);
        }
    }

    @Override
    public void openUrl(String url) {
        if (driver == null) {
            throw new BrowserException("Browser is not initialized");
        }
        page.openUrl(url);
    }

    @Override
    public WebElement findElement(By by) {
        if (driver == null) {
            throw new BrowserException("Browser is not initialized");
        }
        return page.findElement(by);
    }

    @Override
    public void quit() {
        if (driver != null) {
            edgeDriverManager.stopDriver();
        }
    }
}
