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

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")

    print("Page title is: ", driver.title)


    username = driver.find_element(By.XPATH, "//input[starts-with(@class, 'username-')]")

    password = driver.find_element(By.XPATH, "//input[starts-with(@class, 'password-')]")

    username.send_keys("admin")
    password.send_keys("password")

    driver.find_element(By.XPATH, "//button[@type='submit']").click()


    wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation")))


    message = driver.find_element(By.ID, "action-confirmation").text
    print("Login message: ", message)