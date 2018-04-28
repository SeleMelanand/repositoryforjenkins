package com.selenium.diffbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase02LapEmi extends DifferentBrowserinvoke  {
	//public static RemoteWebDriver driver;

	@Test
	public void iebrowserlaunch() throws InterruptedException  {
		invokechrome();
		// Launch AUT
		driver.get("https://www.paisabazaar.com/personal-loan-emi-calculator/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElementById("amount_crore").click();

		/*driver.findElementById("slider_1_txt").sendKeys(Keys.HOME);
		driver.findElementById("slider_1_txt").sendKeys(Keys.CONTROL + "a");*/
		driver.findElementById("slider_1_txt").clear();

		Thread.sleep(5000);
		driver.findElementByClassName("iz_block_button").click();

		JavascriptExecutor js = driver;
		WebElement el = driver.findElementById("slider_1_txt");
		js.executeScript("arguments[0].value = arguments[1];", el, "8,00,00,000");
		driver.findElementById("slider_1_txt").sendKeys(Keys.TAB);

		String emivalue = driver.findElementById("emi_result").getText();
		System.out.println("Personal Loan EMI to be for selected loan amount is : " + emivalue);

	}

}
