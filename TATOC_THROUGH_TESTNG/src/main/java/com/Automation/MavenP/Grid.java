package com.Automation.MavenP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Grid {
	
WebDriver driver;
	
	public Grid (WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}	
	
	public void OnClickGreenBox(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1")).click();
			
	}
	public void OnclickRedBox(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1")).click();
	}
	
	public String getPageTitle(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1")).getText();
	}
	public String getPageTitleError(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[2]/h1")).getText();
	}
}