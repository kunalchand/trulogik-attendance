from browser.EdgeBrowser import EdgeBrowser
from browser.Browser import Browser


class BrowserFactory:
    @staticmethod
    def get_browser(browser_type: str) -> Browser:
        if browser_type.lower() == "edge":
            return EdgeBrowser()
        # Future implementations can add other browsers, e.g., ChromeBrowser
        raise ValueError(f"Unsupported browser type: {browser_type}")
