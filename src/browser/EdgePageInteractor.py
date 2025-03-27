class EdgePageInteractor:
    def __init__(self, driver):
        self.driver = driver

    def open_url(self, url: str):
        """Open a given URL in the browser."""
        self.driver.get(url)

    def find_element(self, by, value):
        """Find and return an element on the page."""
        return self.driver.find_element(by, value)
