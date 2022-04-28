package com.stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStep {

	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1 : user is on login page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yadav\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.way2automation.com");
	}

	
	  @When("user enters  (.*)  and (.*)$")
	  public void user_enters_username_and_password(String uname, String pass) {
	  driver.findElement(By.xpath("(//a[contains(text(),'Register Now')])[1]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Member Login')]")).click();
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	 


	}

	@When("click on login buttom")
	public void click_on_login_buttom() {
		driver.findElement(By.xpath("//input[@class='btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs']")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	   System.out.println("");
	   driver.close();
	}


}
