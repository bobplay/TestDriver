package com.peilei.selenium;

import org.apache.http.auth.BasicUserPrincipal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject {
	private WebElement searchTypeSng;  
    private WebElement fromCity;  
    private WebElement toCity;  
    private WebElement fromDate;  
	public void searchTrip(WebDriver driver,String from, String to ,String date) {  
//        BaseUtils.clearAndTypeString(driver,fromCity, from);  
//        BaseUtils.clearAndTypeString(driver,toCity, to);  
//        BaseUtils.clearAndTypeString(driver,fromDate, date);  
        searchTypeSng.submit();  
    }  
}
