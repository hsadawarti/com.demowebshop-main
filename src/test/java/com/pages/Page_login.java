package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_login extends Baseclass {
	public Page_login(WebDriver driver) {
		this.driver = driver;
	}

	public void login() throws InterruptedException {

		driver.findElement(By.xpath(loc.getProperty("login"))).click();
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys(config.getProperty("user"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(config.getProperty("pass"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("loginSubmit"))).click();
		driver.switchTo().alert().accept();

	}
	
	public void update() {
		System.out.println("Hello there trying to do commit");
	}
}
