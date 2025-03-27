import browser.Browser;
import browser.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) {
        // Use the factory to create a browser instance
        Browser browser = BrowserFactory.getBrowser("edge");
        browser.initialize();

        try {
            browser.openUrl("https://www.youtube.com/");
            WebElement searchBox = browser.findElement(By.name("search_query"));
            searchBox.sendKeys("Selenium tutorials");
            searchBox.submit();
            System.out.println("YouTube opened successfully!");
        } finally {
            System.out.println("End of commands");
        }
    }
}
