package br.com.inmetrics.main.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsActions extends Connections {
	
	public void clickAndWriter(By by, String text) {
		WebDriverWait  wait = new WebDriverWait(driver, 50);
		waitElement(wait, by);
		WebElement clickElement = driver.findElement(by);
		
		if (text != null) {
			clickElement.click();
			clickElement.sendKeys(text);
		} else {
			clickElement.click();
		}
	}
	
	public void clear(By by) {
		WebDriverWait  wait = new WebDriverWait(driver, 50);
		waitElement(wait, by);
		WebElement clickElement = driver.findElement(by);
		clickElement.click();
		clickElement.clear();
	}
	
	
	
	public void waitElement(WebDriverWait wait, By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
