package com.selenium.diffbrowsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WindowsHandleAndPrintAlert{
	
	@Test
	public void runclass() throws InterruptedException, WebDriverException, IOException, AWTException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		String abctext = driver.switchTo().alert().getText();
		System.out.println(abctext);
		
		Thread.sleep(3000);
		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "jpeg", new File("./reporter/Alert1.jpeg"));
				
		/*System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		// Maximize Window and Synchronization
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		String val = "cricket";
		
		driver.findElementByXPath("//input[@id='lst-ib']").sendKeys(val);
		//driver.findElementById("lst-ib").sendKeys(val,Keys.ENTER);
		
		WebElement bodyelement = driver.findElementByTagName("body");
		String textvalue = bodyelement.getText();
		int count = 0; 
		System.out.println(textvalue.length());*/
		
		

		/*for(int i=0;i<textvalue.length();i++){
			System.out.println(textvalue.);
		}*/
		
		
		 
		
		//Below cdode works for naukri
		/*String baswindow = driver.getWindowHandle();
		System.out.println(baswindow);
		
		Set<String> multiplewindow = driver.getWindowHandles();
		
		List<String> subcollectionwindow = new ArrayList(multiplewindow);
		int windowcount = subcollectionwindow.size();
		System.out.println(windowcount);
		
		String runtimewindow =  subcollectionwindow.get(windowcount-2);
		driver.switchTo().window(runtimewindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		

		/*driver.close();
		driver.quit();*/
		
	}

}
