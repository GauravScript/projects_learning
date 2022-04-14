from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


class web_factory:
    def __init__(self, browser):
        self.browser = browser

    def get_driver(self):
        driver =None
        if self.browser =="chrome":
            from webdriver_manager.chrome import ChromeDriverManager

            driver = webdriver.Chrome(executable_path=r"C:\Users\gaurav.si\Desktop\personal\projects_learning\coding\pythonUIautomation\ui_frame_2\driver\chromedriver.exe")
        driver.maximize_window()
        driver.implicitly_wait(10)
        return driver
