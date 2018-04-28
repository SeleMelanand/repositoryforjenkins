package com.selenium.diffbrowsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase04WindowsHandleDemo {
	@Test
	
	public void strindem(){
		
		String name = "$2,00,000.00";
		String inter = name.replace('$', ' ').trim().replace(",", "");
		System.out.println(inter);
		String loanamount = inter.substring(0, inter.length()-3);
		
		System.out.println(loanamount);
	}
	
	
	public static RemoteWebDriver driver;

	
	public void winhandle() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize Window and Synchronization
		driver.manage().window().maximize();
		// Launch AUT
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*String mainwindow = driver.getTitle();
		System.out.println("1st Window: "+ mainwindow);*/
		
		String mainwinname = driver.getWindowHandle();

		driver.findElementByLinkText("Flights").click();
		
		// getting all the names of the windows andd sttoring it in SET
		Set<String>  winhandles = driver.getWindowHandles();
		int wincount  = winhandles.size();
		System.out.println("Total # of windows :"+ wincount);
		
		
		for (String handle : winhandles) {
			if(handle!=mainwinname){
				driver.switchTo().window(handle);
			}
		}
		
		String currentwinname = driver.getWindowHandle();	
		System.out.println("Current windowname is : "+ currentwinname);
		System.out.println("1st Windowhandle: "+ mainwinname);

		driver.findElementById("origin").sendKeys("Chennai",Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementById("destination").sendKeys("Delhi",Keys.ARROW_DOWN,Keys.ENTER);
		
		/*String scrolltext = driver.findElementByXPath("//div[@id='leftbody']/div/marquee").getText();
		System.out.println("Scroll text in flight window is:"+ scrolltext);
		
		driver.close();
		
		//switching to maindow
		driver.switchTo().window(mainwinname);
		
		driver.findElementById("usernameId").sendKeys("ABCD12345");
		driver.findElementByClassName("loginPassword").sendKeys("ASDF");*/
		
		
	}

}
