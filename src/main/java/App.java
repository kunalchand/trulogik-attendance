import browser.Browser;
import browser.BrowserFactory;
import config.AppConfig;
import config.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) {
        ConfigLoader configLoader = new ConfigLoader(args);
        AppConfig appConfig = configLoader.loadConfiguration();
        
        Browser browser = BrowserFactory.getBrowser("edge");
        browser.initialize(appConfig);

        try {
            browser.openUrl("https://www.youtube.com/");
            WebElement searchBox = browser.findElement(By.name("search_query"));
            searchBox.sendKeys("Selenium tutorials");
            searchBox.submit();
            System.out.println("YouTube opened successfully!");
        } finally {
            if (!appConfig.getBrowserOpenStatus()){
                browser.quit();
            }
        }
    }
}
