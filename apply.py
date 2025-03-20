from selenium import webdriver
from selenium.webdriver.edge.service import Service
from selenium.webdriver.common.by import By
import sys
import time

# Path to the Edge WebDriver executable
EDGE_DRIVER_PATH = "./edgedriver_linux64/msedgedriver"

# Create a Service object for Edge WebDriver
service = Service(executable_path=EDGE_DRIVER_PATH)

# Add experimental option to detach browser
options = webdriver.EdgeOptions()
options.add_experimental_option("detach", True)

# Initialize the Edge WebDriver using the Service object and options
driver = webdriver.Edge(service=service, options=options)

try:
    # Open YouTube
    driver.get("https://www.youtube.com/")

    # Example: Interact with elements (if needed)
    search_box = driver.find_element(
        By.NAME, "search_query"
    )  # Locate YouTube's search bar
    search_box.send_keys("Selenium tutorials")  # Type a query into the search bar
    search_box.submit()  # Submit the search form

    print("YouTube opened successfully!")

finally:
    if len(sys.argv) > 1:
        if sys.argv[1] == "-o":
            print("Browser is kept open")
        elif sys.argv[1] == "-c":
            print("Browser is closed on request")
            driver.quit()
        else:
            print("Invalid argument provided, closing browser...")
            driver.quit()
    else:
        print("Browser is closed after execution by default")
        driver.quit()
