from abc import ABC, abstractmethod


class Browser(ABC):
    @abstractmethod
    def initialize(self):
        """Initialize the browser."""
        pass

    @abstractmethod
    def open_url(self, url: str):
        """Open a URL in the browser."""
        pass

    @abstractmethod
    def find_element(self, by, value):
        """Find an element on the page."""
        pass

    @abstractmethod
    def quit(self):
        """Quit the browser."""
        pass
