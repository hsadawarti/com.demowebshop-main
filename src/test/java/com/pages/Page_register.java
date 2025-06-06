package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_register extends Baseclass {

	public Page_register(WebDriver driver){
		this.driver = driver;
	}
	
	public void register() throws Exception {
		
		driver.findElement(By.xpath(loc.getProperty("registerLink"))).click();
		driver.findElement(By.xpath(loc.getProperty("genderRadioButtonMale"))).click();
		driver.findElement(By.xpath(loc.getProperty("firstName"))).sendKeys(data.getProperty("firstName"));
		driver.findElement(By.xpath(loc.getProperty("lastName"))).sendKeys(data.getProperty("lastName"));
		driver.findElement(By.xpath(loc.getProperty("regEmail"))).sendKeys(data.getProperty("regEmail"));
		driver.findElement(By.xpath(loc.getProperty("regPass"))).sendKeys(data.getProperty("regPass"));
		driver.findElement(By.xpath(loc.getProperty("regCnfmPass"))).sendKeys(data.getProperty("regCnfmPass"));
		driver.findElement(By.xpath(loc.getProperty("registerButton"))).click();
		
		List<WebElement> elements = driver.findElements(By.xpath(loc.getProperty("alreadyRgstrdText")));
		if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
			System.out.println(elements.get(0).getText());
		}else {
			System.out.println("Not already registered");
		}
		
		
		
		
	}
}
