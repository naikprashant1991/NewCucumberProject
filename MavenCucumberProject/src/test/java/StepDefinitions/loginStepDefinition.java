package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginStepDefinition {

	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
	}

	@When("^Title of the login page is free CRM$")
	public void title_of_the_login_page_is_free_CRM() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("naikprashant1991");
		driver.findElement(By.name("password")).sendKeys("Crmpro@123");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
