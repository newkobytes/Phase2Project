package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageStepdefs {

	WebDriver driver = Hooks.driver; 
	@Given("I launched to Swaglink")
	public void i_launched_to_Swaglink() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	
	@And("I enter username and password")
	public void i_enter_username_and_password() {
	   
		// Enter correct user name
				WebElement UserName = driver.findElement(By.id("user-name"));
				UserName.sendKeys("standard_user");
				
				// Enter correct Password
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("secret_sauce");
	}

	@And("I click on Loginbutton of Swag page")
	public void i_click_on_Loginbutton_of_Swag_page() {
		WebElement Loginbtn = driver.findElement(By.id("login-button"));
	    Loginbtn.click();
	}

	@When("I click product name  {string}")
	public void i_click_product_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement prd = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	    prd.click();

	}

	@Then("I land on Add to cart page")
	public void i_land_on_Add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Landed on Add to cart page");
	}

	@And("I click on Add to cart button")
	public void i_click_on_Add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement adc = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	    adc.click();

	}

	@Then("My basket value is changed to {string}")
	public void my_basket_value_is_changed_to(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement cartval = driver.findElement(By.xpath("//*[text()='1']"));
	     String Cart=cartval.getText();
	    Assert.assertEquals(Cart, string1);

	}



}
