package com.peilei.selenium;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	public void checkrandom(WebDriver driver) {
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.document.getElementById('haha').click()");
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		if (elements.size() > 0 && elements != null) {
			Random random = new Random();	
			for(int i=0;i<elements.size();i++){
				int cbs = random.nextInt(elements.size());
				WebElement element = elements.get(cbs);
				System.out.println(cbs);
				if (element.getAttribute("type").equals("checkbox")) {
					element.click();
				}
				else if(element.isSelected()){
					elements.remove(cbs);
				}
			}
			
		}
	}

}
