from ..browser.BrowserFactory import BrowserFactory
from selenium.webdriver.common.by import By


def app():
    # Use the factory to create a browser instance.
    # Dependency injection: main() depends only on the Browser interface.
    browser = BrowserFactory.get_browser("edge")
    browser.initialize()

    try:
        browser.open_url("https://www.youtube.com/")
        search_box = browser.find_element(By.NAME, "search_query")
        search_box.send_keys("Selenium tutorials")
        search_box.submit()
        print("YouTube opened successfully!")
    finally:
        print("End of commands")


if __name__ == "__main__":
    app()
