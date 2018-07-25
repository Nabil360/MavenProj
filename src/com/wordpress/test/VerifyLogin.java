package com.wordpress.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import org.openqa.selenium.chrome.*;

public class VerifyLogin {
	
	
	@Test
	public void verifyLogin() {
		
		System.setProperty("webDriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in");
		
		
		LoginPage login=new LoginPage(driver);
		
		login.typeuserName();
		
		login.clickContinueButton();
		
		driver.quit();
	}
	
	
	

}
