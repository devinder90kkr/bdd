package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import utils.ConfigManager;
import utils.WebDriverManager;

public class Loginsadvocate_PF {

    WebDriver driver;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("Browser is open")
    public void browser_is_open() {
        driver = WebDriverManager.getDriver();
        login = new LoginPage_PF(driver);
        home = new HomePage_PF(driver);
    }

    @And("the user is on login page")
    public void the_user_is_on_login_page() {
        String baseUrl = ConfigManager.getProperty("baseUrl");
        if (baseUrl == null || baseUrl.isEmpty()) {
            throw new RuntimeException("Base URL is not configured in config.properties");
        }
        System.out.println("Navigating to URL: " + baseUrl);
        driver.navigate().to(baseUrl);
    }

    @When("user enters advocate login credentials from config file")
    public void user_enters_advocate_login_credentials_from_config_file() throws InterruptedException {
        String email = ConfigManager.getProperty("advocateemail");
        String password = ConfigManager.getProperty("advocatepassword");
        if (email == null || password == null) {
            throw new RuntimeException("Advocate Email or Password is not configured in config.properties");
        }
        login.enterUsername(email);
        login.enterpassword(password);
        Thread.sleep(2500);
    }

    @When("user enters coach login credentials from config file")
    public void user_enters_coach_login_credentials_from_config_file() throws InterruptedException {
        String email = ConfigManager.getProperty("coachemail");
        String password = ConfigManager.getProperty("coachpassword");
        if (email == null || password == null) {
            throw new RuntimeException("Coach Email or Password is not configured in config.properties");
        }
        login.enterUsername(email);
        login.enterpassword(password);
        Thread.sleep(2500);
    }

    @When("user enters doctor login credentials from config file")
    public void user_enters_doctor_login_credentials_from_config_file() throws InterruptedException {
        String email = ConfigManager.getProperty("doctoremail");
        String password = ConfigManager.getProperty("doctorpassword");
        if (email == null || password == null) {
            throw new RuntimeException("Doctor Email or Password is not configured in config.properties");
        }
        login.enterUsername(email);
        login.enterpassword(password);
        Thread.sleep(2500);
    }

    @When("the user clicks on Login button")
    public void the_user_clicks_on_Login_button() {
        login.clickOnLogin();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() throws InterruptedException {
        home.clickOnLogout();
        Thread.sleep(2000);
        home.clickOnConfirm();
        Thread.sleep(2500);
        WebDriverManager.quitDriver();
    }
}
