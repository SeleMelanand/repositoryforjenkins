package com.selenium.diffbrowsers;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LinkCount {
	//public RemoteWebDriver driver;

	@Test
	public void countinglink() {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		/*driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("Backbag",Keys.ENTER);
		WebElement particulatsection = driver.findElementByXPath("//div[contains(@class,' acs-carousel-header')]/ul");
		
		//List<WebElement> links = particulatsection.findElements(By.tagName("span"));
		List<WebElement> links = driver.findElementsByXPath("//h2[contains(@class,'s-access-title')]");
		int count;
		count = links.size();
		System.out.println(count);
		int j=1;
		for (WebElement data : links) {
			
			//String ratings = driver.findElementByXPath("(//a[contains(@class,'a-popover')]/i/span)[j]").getText();
			
			System.out.println(data.getText());
			//j++;
		}*/				
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Actions action = new Actions(driver);
		String basewindow  = driver.getWindowHandle();
		System.out.println(basewindow);	
		action.moveToElement(driver.findElementByXPath("//a[text()=' Tourism  ']")).build().perform();
		action.moveToElement(driver.findElementByXPath("//a[text()='IRCTC Tourism']")).build().perform();	
		action.moveToElement(driver.findElementByXPath("//a[contains(text(),'Maharajas')]")).click().build().perform();
		
		Set<String> multiplewindows = driver.getWindowHandles();
		System.out.println(multiplewindows.size());
		for (String win : multiplewindows) {
			if(win != basewindow){
				driver.switchTo().window(win);
			}
		}	
		
		String newwindow = driver.getWindowHandle();
		System.out.println(newwindow);	
		System.out.println("Text available in new window is -"+ driver.findElementByXPath("//p[@class='c-num']").getText());
		driver.switchTo().window(newwindow).close();
		
		
		driver.switchTo().window(basewindow);
		driver.findElementById("usernameId").sendKeys("sak001");
		
		
		//alerts
		/*driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("");		
		driver.switchTo().alert().getText();*/
		
		
		//frames 
		/*driver.switchTo().frame("id or name");
		driver.switchTo().frame(0);
		driver.switchTo().frame("webelement");
		driver.findElementById("").getText();
		driver.switchTo().defaultContent();*/
		
		//windows
		//driver.switchTo().window(nameOrHandle)
		
		

		
		
		
		
	}
}
