import pytest as pytest

from UI_Framework.web_driver.web_Factory import web_driver


@pytest.fixture()
def setup():
    driver = web_driver("chrome").get_driver()
    try:
        driver.get("https://github.com/")
        yield driver
    finally:
        driver.close()
        driver.quit()

