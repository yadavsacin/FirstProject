package Screenshotdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static WebDriver driver;
	public static void CaptureScreen(String Filename) throws IOException
	{
	   
		TakesScreenshot tc = (TakesScreenshot)driver;
		File scr = tc.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Yadav\\eclipse-workspace\\CucummberProject\\Screenshot"+Filename+".png");
		Files.copy(scr, des);	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Step1 : user is on login page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yadav\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.way2automation.com");
        CaptureScreenshot.CaptureScreen("homepage");
        driver.findElement(By.xpath("(//a[contains(text(),'Register Now')])[1]")).click();
  	  driver.findElement(By.xpath("//span[contains(text(),'Member Login')]")).click();
  	  WebElement email =driver.findElement(By.id("email"));
  	 WebElement pass =driver.findElement(By.id("password"));
  	 JavascriptExecutor je = (JavascriptExecutor)driver;
  	 je.executeScript("arguments[0].value='Sachin kumar'",email);
  	je.executeScript("arguments[0].value='Sachin'", pass);

	}

}
