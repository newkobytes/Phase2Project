package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {

	WebDriver driver = Hooks.driver; 
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	   				
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
		
	    // Enter correct user name
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		
		// Enter correct Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement Loginbtn = driver.findElement(By.id("login-button"));
	    Loginbtn.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() {
	   
		// Enter incorrect user name
				WebElement UserName = driver.findElement(By.id("user-name"));
				UserName.sendKeys("standard_use");
				
		// Enter incorrect Password
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("sec_sauce");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String experror) {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
	   String ActualError = error.getText();
	   String ExpectedError = "Epic sadface: Username and password do not match any user in this service";
	   Assert.assertEquals(experror, ActualError);

	  
	}

	
}
