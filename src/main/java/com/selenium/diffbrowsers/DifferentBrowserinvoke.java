package com.selenium.diffbrowsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DifferentBrowserinvoke{
	public RemoteWebDriver driver;


	//@Test
	public void invokechrome() {
		System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize Window and Synchronization
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/bus-tickets/kpn-travels-pondicherry.html");
		//System.out.println(driver.getTitle());
		System.out.println("testcase 1");
		
		try {
			if(driver.findElementByXPath("//div[@id='search_new']/span1").isDisplayed()){
				System.out.println("True");
			}else{
				System.out.println("false");
			}
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
		
		/*driver.get("https://www.paisabazaar.com/home-loan-emi-calculator/");
		 driver.findElementById("slider_1_txt").clear();
		 
		 //Using Java script executor we can enter text value
		 WebElement wb = driver.findElementById("slider_1_txt");
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='25,00,000'", wb);*/
		
	}
	
	
		@Test
		public void invokechrome1() {
			System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
			driver = new ChromeDriver();
			// Maximize Window and Synchronization
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			driver.switchTo().frame("iframeResult");
			driver.findElementByXPath("//button[text()='Try it']").click();
			System.out.println(driver.findElementByXPath("//body[@contenteditable='false']").getText());
			
		}
		
		
	//@Test(threadPoolSize = 2, invocationCount=5)
	public void invokeinternetexplorer() {
		System.setProperty("webdriver.ie.driver", "D://drivers//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		// Maximize Window and Synchronization
		driver.manage().window().maximize();
	}
	
	//@Test
	public void kpntravels() {
		invokeinternetexplorer();
		// Launch AUT
		

	}	
}
