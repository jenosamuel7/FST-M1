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


service = FirefoxService(GeckoDriverManager().install())


with webdriver.Firefox(service=service) as driver:

    wait = WebDriverWait(driver, 10)


    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    print("Page title is: ", driver.title)


    checkbox = driver.find_element(By.ID, "dynamicCheckbox")

    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")

    print("Checkbox is visible: ", checkbox.is_displayed())


    checkbox_toggle.click()

    wait.until(EC.invisibility_of_element(checkbox))

    print("Checkbox is visible: ", checkbox.is_displayed())