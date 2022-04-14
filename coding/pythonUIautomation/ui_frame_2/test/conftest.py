import pytest

from pythonUIautomation.ui_frame_2.base.web_factory import web_factory
from pythonUIautomation.ui_frame_2.common.constant import *

@pytest.fixture
def setup():
    driver =None
    try:
        driver = web_factory(browser).get_driver()
        driver.get(URL)
        yield driver
    finally:
        driver.close()