package Assertions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestCase1 {

	@Test
	public void loginTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	
		WebElement usernametxt=driver.findElement(By.name("userName"));
		WebElement passwordtxt=driver.findElement(By.name("password"));
	
		
		//This is to check whether the textbox is displayed or not
		//Test will only continue, if the below statement is true
		
		Assert.assertTrue(usernametxt.isDisplayed());
		usernametxt.sendKeys("mercury");
	
		Assert.assertTrue(passwordtxt.isDisplayed());
		passwordtxt.sendKeys("mercury");
	
		/*Assert.assertFalse(usernametxt.isDisplayed());
		usernametxt.sendKeys("mercury");
	
		Assert.assertFalse(passwordtxt.isDisplayed());
		passwordtxt.sendKeys("mercury");*/
		
		driver.findElement(By.name("submit")).click();
		
		//validation
		String ExpTitle = "Login: Mercury Tours";
		
		Assert.assertEquals(ExpTitle, driver.getTitle()); //compares both the titles
		
		driver.close();
		
	}
}
