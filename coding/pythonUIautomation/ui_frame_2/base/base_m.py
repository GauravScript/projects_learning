from selenium.webdriver.common.by import By


class base_methods:
    def __init__(self, driver):
        self.driver=driver

    def find_element(self, byType = By.XPATH, locator=""):
        try:
            return self.driver.find_element(byType, locator)
        except Exception as error:
            raise Exception(" element not found")