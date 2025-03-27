from selenium import webdriver
from selenium.webdriver.edge.service import Service
from config.ConfigLoader import ConfigLoader


class EdgeDriverManager:
    def __init__(self):
        self.driver = None

    def start_driver(self):
        """Starts the Edge WebDriver using the correct configuration."""
        service = Service(ConfigLoader.get_edge_driver_path())

        options = webdriver.EdgeOptions()
        options.add_experimental_option("detach", ConfigLoader.get_browser_options())

        self.driver = webdriver.Edge(service=service, options=options)
        return self.driver

    def stop_driver(self):
        """Stops the Edge WebDriver."""
        if self.driver:
            self.driver.quit()
