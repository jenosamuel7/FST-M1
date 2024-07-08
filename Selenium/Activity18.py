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


    multiselect_list = driver.find_element(By.ID, "multi-select")

    multiselect = Select(multiselect_list)


    multiselect.select_by_visible_text("Javascript")

    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)


    for x in range(4, 6):
        multiselect.select_by_index(x)
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)


    multiselect.select_by_value("node")
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)

 
    multiselect.deselect_by_index(7)
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)