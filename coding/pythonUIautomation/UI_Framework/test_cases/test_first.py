from time import sleep

from selenium.webdriver.common.by import By



def test_first1(setup):
    driver = setup
    market_place = driver.find_element(By.XPATH, value=".//*[text()='Marketplace']")
    market_place.click()
    search = driver.find_element(By.XPATH, value=".//*[@type='search']")
    search.click()
    search.send_keys("rollbar")
    search = driver.find_element(By.XPATH, value=".//*[text()='Best Match']")
    search.click()
    text1 = driver.find_element(By.XPATH, value=".//*[contains(text(),'Rollbar')]").text
    assert text1 in "Rollbar"
    sleep(5)