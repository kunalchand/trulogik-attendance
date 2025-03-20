from selenium import webdriver
from selenium.webdriver.edge.service import Service
from selenium.webdriver.common.by import By
from src.exceptions.browser_exceptions import BrowserException


class EdgeBrowser:
    def __init__(self, executable_path, detach=False):
        self.executable_path = executable_path
        self.detach = detach
        self.driver = None

    def initialize(self):
        try:
            service = Service(executable_path=self.executable_path)
            options = webdriver.EdgeOptions()
            if self.detach:
                options.add_experimental_option("detach", True)
            self.driver = webdriver.Edge(service=service, options=options)
        except Exception as e:
            raise BrowserException("Failed to initialize Edge browser") from e

    def get(self, url):
        if not self.driver:
            raise BrowserException("Browser is not initialized")
        self.driver.get(url)

    def find_element(self, by, value):
        if not self.driver:
            raise BrowserException("Browser is not initialized")
        return self.driver.find_element(by, value)

    def quit(self):
        if self.driver:
            self.driver.quit()
