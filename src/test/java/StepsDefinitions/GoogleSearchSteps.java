package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("brower is open")
	public void brower_is_open() {
		System.out.println("Inside Step - brower is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :" +projectPath);
		
		System.getProperty("webdriver.chrome.driver", projectPath+"src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is on google search page");
		driver.navigate().to("https://google.com");
	}
	
	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		System.out.println("Inside Step - user enter a text in search box");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation");
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside Step - hits enters");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is navigated to search results");
	
		driver.close();
		driver.quit();
		}



}
