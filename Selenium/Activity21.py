from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import WebDriverException
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.remote.webdriver import WebDriver
from selenium.webdriver.remote.webdriver import WebElement
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC 
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select


service = FirefoxService(GeckoDriverManager().install())


with webdriver.Firefox(service=service) as driver:

    wait = WebDriverWait(driver, 10)


    driver.get("https://v1.training-support.net/selenium/tab-opener")

    print("Page title is: ", driver.title)


    print("Current window handle: ", driver.current_window_handle)

    driver.find_element(By.ID, "launcher").click()


    wait.until(EC.number_of_windows_to_be(2))

    print("All window handles: ", driver.window_handles)


    driver.switch_to.window(driver.window_handles[1])

 
    print("Current window handle: ", driver.current_window_handle)

    print("New Tab title: ", driver.title)

    heading = driver.find_element(By.XPATH, "//div[@class='content']")
    print(heading.text)

    driver.find_element(By.ID, "actionButton").click()

    wait.until(EC.number_of_windows_to_be(3))

    print("All window handles: ", driver.window_handles)


    driver.switch_to.window(driver.window_handles[2])


    print("Current window handle: ", driver.current_window_handle)

    print("New Tab title: ", driver.title)
   
    heading = driver.find_element(By.XPATH, "//div[@class='content']")
    print(heading.text)