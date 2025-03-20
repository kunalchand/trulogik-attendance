from src.browser.edge_browser import EdgeBrowser
from src.browser.browser import Browser


class BrowserFactory:
    @staticmethod
    def get_browser(
        browser_type: str, executable_path: str, detach: bool = False
    ) -> Browser:
        if browser_type.lower() == "edge":
            return EdgeBrowser(executable_path, detach)
        # Future implementations can add other browsers, e.g., ChromeBrowser
        raise ValueError(f"Unsupported browser type: {browser_type}")
