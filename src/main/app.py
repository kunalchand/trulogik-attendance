from src.browser.edge_browser import EdgeBrowser
from src.utils.args_parser import ArgsParser
from config.settings import EDGE_DRIVER_PATH
from selenium.webdriver.common.by import By


def main():
    args_parser = ArgsParser()
    detach = args_parser.parse_args()

    edge_browser = EdgeBrowser(executable_path=EDGE_DRIVER_PATH, detach=detach)
    edge_browser.initialize()

    try:
        edge_browser.get("https://www.youtube.com/")
        search_box = edge_browser.find_element(By.NAME, "search_query")
        search_box.send_keys("Selenium tutorials")
        search_box.submit()
        print("YouTube opened successfully!")
    finally:
        if not detach:  # Only quit if detach=False (-c argument)
            edge_browser.quit()


if __name__ == "__main__":
    main()
