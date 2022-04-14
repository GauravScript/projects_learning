from pythonUIautomation.ui_frame_2.pages.loginpage import login_page


def test_first(setup):
    driver = setup()
    login = login_page(driver)
    login.click_search_box()
    print()
