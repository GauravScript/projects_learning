from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


class web_driver:
    def __init__(self, browser):
        self.browser = browser

    def get_driver(self):
        driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
        if self.browser == "chrome":
            driver = self.get_chrome_driver()
        driver.maximize_window()
        driver.implicitly_wait(10)
        driver.set_page_load_timeout(10)
        return driver

    def get_chrome_driver(self):
        return webdriver.Chrome(service=Service(ChromeDriverManager().install()))