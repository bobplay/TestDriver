package com.peilei.selenium;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBrower {

	private static final int CHROM_BROWER = 0;
	private static final int FIREFOX_BROWER = 1;
	private static final int IE_BROWER = 2;
	private static final int index = 1;
	public static void main(String[] args) {
		openWeb(getWebDriver(CHROM_BROWER));
	}
	
	private static RemoteWebDriver getWebDriver(int type) {
		RemoteWebDriver driver = null;
		switch(type){
		case CHROM_BROWER:
			System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case FIREFOX_BROWER:
			FirefoxBinary binary = new FirefoxBinary(new File("D:\\Mozilla Firefox\\firefox.exe"));
			driver = new FirefoxDriver(binary,null);
			break;
		case IE_BROWER:
			System.setProperty("webdriver.ie.driver", "./src/IEDriverServer.exe");
			driver = new InternetExplorerDriver(2035);
			break;
		}
		
		
		return driver;
	}

	/**
	 * 打开网页
	 * @param webDriver  各个浏览器driver
	 */
	public static void openWeb(RemoteWebDriver webDriver){
		try {
			long time = 2000;
//			webDriver.get("file:///C:/Users/1A-030/Desktop/select.html");	
//			WebElement element_select = webDriver.findElement(By.name("city"));
////			Select sec = new Select(element);
////			System.out.println(sec.getAllSelectedOptions());
//			SelectRandom select = new SelectRandom(element_select);
//			select.getOptions(element_select);
//			Object[] windowHandles = webDriver.getWindowHandles().toArray();
//			webDriver.switchTo().window(windowHandles[windowHandles.length-1].toString());
			/**
			 * 复选框和下拉框有效数据的随机显示
			 */
//			webDriver.get("file:///C:/Users/1A-030/Desktop/checkbox.html");
//		    CheckBox  checkbox = new CheckBox();
//		    checkbox.checkrandom(webDriver);
//		    webDriver.navigate().to("file:///C:/Users/1A-030/Desktop/select.html");
//		    Object[] windowHandles =  webDriver.getWindowHandles().toArray();
//		    webDriver.switchTo().window(windowHandles[windowHandles.length-1].toString());
//		    WebElement element_select1 = webDriver.findElement(By.name("change"));
//	
//			SelectRandom sec1 = new SelectRandom(element_select1);
//			sec1.getChange(element_select1,index);
			webDriver.get("file:///C:/Users/1A-030/Desktop/table.html");
			WebElement elementOrder = webDriver.findElement(By.id("orderList"));
			getOrder(elementOrder,webDriver);
//			System.out.println("打开页面: "+webDriver.getWindowHandle().toString());
//		chromeDriver.findElement(By.id("kw")).sendKeys("自动化测试");
//		chromeDriver.findElement(By.id("su")).click();
//			webDriver.navigate().to("http://www.youku.com/");
//			webDriver.executeScript("alert(\"huile\")");
//			webDriver.getKeyboard().pressKey(Keys.F5);
//			webDriver.findElementByPartialLinkText("新闻").click();
//			sleep(2000);
//			Object[] windowHandles = webDriver.getWindowHandles().toArray();
//			for (Object object : windowHandles) {
//				System.out.println(object);
//			}
//			webDriver.switchTo().window(windowHandles[windowHandles.length-1].toString());
//			System.out.println("xinyemian: "+webDriver.getWindowHandle().toString());
//			sleep(time);
//			webDriver.findElement(By.xpath("//input[@name='word']")).sendKeys("北京");
//			webDriver.findElement(By.className("btn")).click();
//			sleep(time);
//			webDriver.navigate().back();
	//		sleep(time);
//			webDriver.navigate().forward();
//			sleep(time);
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
		}
	}

	private static void getOrder(WebElement elementOrder,
			RemoteWebDriver webDriver) {
		
	}

	public static void sleep(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
