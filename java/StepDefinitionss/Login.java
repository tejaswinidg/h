package StepDefinitionss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Given("I want to open the driver")
	public void i_want_to_open_the_driver() {
		WebDriverManager.chromedriver().browserVersion("122.0.6261.112").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
	
	  
	}

	@Then("I want to open the browser")
	public void i_want_to_open_the_browser() {
		driver.get("https://www.google.com/");
	 
	}

	@Then("I want to close the browser")
	public void i_want_to_close_the_browser() {
	    driver.close();
	   
	}
}
