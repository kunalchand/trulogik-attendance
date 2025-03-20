from src.browser.browser_factory import BrowserFactory
from src.utils.args_parser import ArgsParser
from config.settings import EDGE_DRIVER_PATH
from selenium.webdriver.common.by import By


def main():
    args_parser = ArgsParser()
    detach = args_parser.parse_args()

    # Use the factory to create a browser instance.
    # Dependency injection: main() depends only on the Browser interface.
    browser = BrowserFactory.get_browser("edge", EDGE_DRIVER_PATH, detach)
    browser.initialize()

    try:
        browser.open_url("https://www.youtube.com/")
        search_box = browser.find_element(By.NAME, "search_query")
        search_box.send_keys("Selenium tutorials")
        search_box.submit()
        print("YouTube opened successfully!")
    finally:
        if not detach:  # Only quit if detach=False (e.g., using -c argument)
            browser.quit()


if __name__ == "__main__":
    main()
