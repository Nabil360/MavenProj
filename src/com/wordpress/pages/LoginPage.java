/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nabil
 * 
 * This class will store all the locators and methods
 *
 */
public class LoginPage {
	
	WebDriver driver;
	

	By userName=By.name("usernameOrEmail");
	
	By continueButton=By.xpath("//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void typeuserName() {
		
		driver.findElement(userName).sendKeys("admin");
		
	}
	
	public void clickContinueButton() {
		
		driver.findElement(continueButton).click();
		
		
	}
	
	
}