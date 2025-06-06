package com.utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Baseclass;

public class Automation_utilities extends Baseclass {

	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	static JavascriptExecutor js = (JavascriptExecutor)driver;
	static Actions actions = new Actions(driver);
	
	// Scrolling till the element comes under the view
	public static void ScrollIntoView(WebDriver driver, WebElement element) {
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
	}
	
	// Waiting for the element to be visible 
	public static void checkVisibilityOfTheElement(WebDriver driver, WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	// Wait for it to be interactable (optional but safe)
	public static void waitForTheElementToBeClickable(WebDriver driver, WebElement element, boolean shouldClick) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		actions.moveToElement(element).perform();
		if (shouldClick) {
			element.click();
		}
	}
	
	public static void selectByVisibleText(WebDriver driver, WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void highlightElement(WebDriver driver, WebElement element) {
		
		// Save the Original Style
		String originalStyle = element.getAttribute("style");
		
		// Apply highlight style
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", 
                element, "border: 2px solid red; background: #66ff66");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		 Revert to original style
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
		
	}
	
}
