package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Automation_utilities;

public class Page_computers extends Baseclass {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	Actions actions = new Actions(driver);
	
	public Page_computers(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void computers() throws Exception {
		
		// Just hover on Computers -- Old Code
//		WebElement computersLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("computers"))));
//		actions.moveToElement(computersLink).perform();
		
		// Just hover on Computers
		WebElement computersLink = driver.findElement(By.xpath(loc.getProperty("computers")));
		Automation_utilities.highlightElement(driver, computersLink);
		Automation_utilities.checkVisibilityOfTheElement(driver, computersLink);
		Automation_utilities.waitForTheElementToBeClickable(driver, computersLink, false);

		// Then click Desktop -- Old Code
//		WebElement desktop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("desktop"))));
//		desktop.click();
		
		// Then click Desktop
		WebElement desktop = driver.findElement(By.xpath(loc.getProperty("desktop")));
		Automation_utilities.highlightElement(driver, desktop);
		Automation_utilities.checkVisibilityOfTheElement(driver, desktop);
		Automation_utilities.waitForTheElementToBeClickable(driver, desktop, true);
		
		WebElement sortBy = driver.findElement(By.xpath(loc.getProperty("sortby")));
		Automation_utilities.highlightElement(driver, sortBy);
		String sortByPrice = driver.findElement(By.xpath(loc.getProperty("sortby_price"))).getText();
//		System.out.println(sortByPrice);
		Automation_utilities.highlightElement(driver, sortBy);
		Automation_utilities.selectByVisibleText(driver, sortBy, sortByPrice);

		WebElement prpage_size = driver.findElement(By.xpath(loc.getProperty("products-pagesize")));
		Automation_utilities.highlightElement(driver, prpage_size);
		String pgsizee = driver.findElement(By.xpath(loc.getProperty("set_pagesize"))).getText();
		//String pgsize_text = pgsizee.getText();
		//System.out.println(pgsize_text);
		Automation_utilities.highlightElement(driver, prpage_size);
		Automation_utilities.selectByVisibleText(driver, prpage_size, pgsizee);
		
		 WebElement view_as = driver.findElement(By.xpath(loc.getProperty("view_as")));
		 Automation_utilities.highlightElement(driver, view_as);
		 String set_view = driver.findElement(By.xpath(loc.getProperty("set_view"))).getText();
		 Automation_utilities.highlightElement(driver, view_as);
		 Automation_utilities.selectByVisibleText(driver, view_as, set_view);

		 // ------------ Product Link --------------
		 driver.findElement(By.xpath(loc.getProperty("product"))).click();
		 
		 WebElement click_on_processor = driver.findElement(By.xpath(loc.getProperty("click_on_processor")));
		 Automation_utilities.highlightElement(driver, click_on_processor);
		 String select_processor = driver.findElement(By.xpath(loc.getProperty("select_processor"))).getText();
		 Automation_utilities.highlightElement(driver, click_on_processor);
		 Automation_utilities.selectByVisibleText(driver, click_on_processor, select_processor);
		 
		 WebElement click_on_ram = driver.findElement(By.xpath(loc.getProperty("click_on_ram")));
		 Automation_utilities.highlightElement(driver, click_on_ram);
		 String select_ram = driver.findElement(By.xpath(loc.getProperty("select_ram"))).getText();
		 Automation_utilities.highlightElement(driver, click_on_ram);
		 Automation_utilities.selectByVisibleText(driver, click_on_ram, select_ram);
		 
		 WebElement hdd_radio_btn2 = driver.findElement(By.xpath(loc.getProperty("hdd_radio_btn2")));
		 Automation_utilities.highlightElement(driver, hdd_radio_btn2);
		 hdd_radio_btn2.click();
		 
		 WebElement os_radio_btn2 = driver.findElement(By.xpath(loc.getProperty("os_radio_btn2")));
		 Automation_utilities.highlightElement(driver, os_radio_btn2);
		 os_radio_btn2.click();
		 
		 Thread.sleep(1000);
		 WebElement soft_check_msOffice = driver.findElement(By.xpath(loc.getProperty("soft_check_msOfc2")));
		 Automation_utilities.highlightElement(driver, soft_check_msOffice);
		 
		 WebElement soft_check_cmndr2 = driver.findElement(By.xpath(loc.getProperty("soft_check_cmndr2")));
		 Automation_utilities.highlightElement(driver, soft_check_cmndr2);
		 soft_check_cmndr2.click();
		 
		 driver.findElement(By.xpath(loc.getProperty("addToCart"))).click();
		  
		 
	}
	
}
