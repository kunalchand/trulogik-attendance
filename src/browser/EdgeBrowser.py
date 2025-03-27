from browser import EdgePageInteractor
from browser.EdgeDriverManager import EdgeDriverManager
from browser.Browser import Browser
from exceptions.BrowserException import BrowserException


class EdgeBrowser(Browser):
    def __init__(self):
        self.edge_driver_manager = EdgeDriverManager()
        self.driver = None
        self.page = None

    def initialize(self):
        try:
            self.driver = self.edge_driver_manager.start_driver()
            self.page = EdgePageInteractor(self.driver)
        except Exception as e:
            raise BrowserException("Failed to initialize Edge browser") from e

    def open_url(self, url: str):
        if not self.driver:
            raise BrowserException("Browser is not initialized")
        self.page.open_url(url)

    def find_element(self, by, value):
        if not self.driver:
            raise BrowserException("Browser is not initialized")
        return self.page.find_element(by, value)

    def quit(self):
        if self.driver:
            self.edge_driver_manager.stop_driver()
