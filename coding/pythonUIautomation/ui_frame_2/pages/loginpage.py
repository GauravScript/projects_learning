from pythonUIautomation.ui_frame_2.base.base_m import base_methods

search_box = ".//*[@title='Search']"

class login_page(base_methods):

    def __init__(self, driver):
        super().__init__(driver)

    def click_search_box(self):
        element = self.find_element(locator=search_box)
        element.click()