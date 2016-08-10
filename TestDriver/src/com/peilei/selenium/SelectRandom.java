package com.peilei.selenium;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectRandom extends Select {

	public SelectRandom(WebElement element) {
		super(element);
		// TODO Auto-generated constructor stub
	}
	public void getOptions(WebElement element){
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		/**
		 * 判断下拉框是否有内容，随机下拉框内容
		 */
		if(options.size()>0 && options != null){
			Random random = new Random();
			int random_select = random.nextInt(options.size());
			System.out.println(options);
			sel.selectByIndex(random_select);
		}
	}
	/**
	 * 将默认的无效值去掉，例如请选择
	 * @param element
	 * @param index
	 */
	public void getChange(WebElement element ,int index){
		Select sel = new Select(element);
		 List<WebElement> options = sel.getOptions();
		 if(options.size()>0 && options != null){
			 Random random = new Random();
			int random_select = random.nextInt(options.size()-index)+index;
			sel.selectByIndex(random_select);
		 }
	}
}
