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
 
    driver.get("https://v1.training-support.net/selenium/selects")
  
    print("Page title is: ", driver.title)


    single_select = driver.find_element(By.ID, "single-select")

    dropdown = Select(single_select)


    dropdown.select_by_visible_text("Option 2")

    print("Selected option: ", dropdown.first_selected_option.text)


    dropdown.select_by_index(3)
    print("Selected option: ", dropdown.first_selected_option.text)


    dropdown.select_by_value("4")
    print("Selected option: ", dropdown.first_selected_option.text)


    select_options = dropdown.options
    for option in select_options:
        print("Option: ", option.text)


service = FirefoxService(GeckoDriverManager().install())


with webdriver.Firefox(service=service) as driver:

    driver.get("https://v1.training-support.net/selenium/selects")

    print("Page title is: ", driver.title)


    single_select = driver.find_element(By.ID, "single-select")

    dropdown = Select(single_select)


    dropdown.select_by_visible_text("Option 2")

    print("Selected option: ", dropdown.first_selected_option.text)


    dropdown.select_by_index(3)
    print("Selected option: ", dropdown.first_selected_option.text)


    dropdown.select_by_value("4")
    print("Selected option: ", dropdown.first_selected_option.text)


    select_options = dropdown.options
    for option in select_options:
        print("Option: ", option.text)