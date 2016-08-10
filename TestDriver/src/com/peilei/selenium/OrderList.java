package com.peilei.selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrderList {
	private long price;
	private long id;
	private String username;
	private Map<String,WebElement> doList = new  HashMap<String,WebElement>();
	public OrderList(String orderid,WebDriver driver){
		WebElement oldOrder = driver.findElement(By.id("orderList"));
		List<WebElement> trs = oldOrder.findElements(By.tagName("tr"));
		for(WebElement tr : trs){
			String oid = tr.findElements(By.tagName("td")).get(0).getText();
			if(!orderid.equalsIgnoreCase(oid)){
				continue;
			}
			this.setId(Long.parseLong(tr.findElements(By.tagName("td")).get(0).getText()));
			this.price = Long.parseLong(tr.findElements(By.tagName("td")).get(1).getText());
			this.setUsername(tr.findElements(By.tagName("td")).get(2).getText());
			List<WebElement> dos = tr.findElements(By.tagName("td")).get(3).findElements(By.tagName("a"));
			for(WebElement d :dos){
				this.doList.put(d.getText(), d);
			}
		}
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
