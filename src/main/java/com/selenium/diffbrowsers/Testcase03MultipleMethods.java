package com.selenium.diffbrowsers;

import org.testng.annotations.Test;

public class Testcase03MultipleMethods extends DifferentBrowserinvoke {
	// public RemoteWebDriver driver;

	@Test
	public void irctc() {
		invokechrome();
		// Launch AUT
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//System.out.println(driver.getTitle());
		System.out.println("testcase 3");
		kpntravels();
		
	}

	/*@Test(priority = 1)
	public void kpntravels() {
		invokeinternetexplorer();
		// Launch AUT
		driver.get("http://kpntravels.in/");
		//System.out.println(driver.getTitle());
		System.out.println("testcase 1");

	}*/

	@Test
	public void redbus() {
		invokeinternetexplorer();
		// invokechrome();

		// Launch AUT
		driver.get("https://www.redbus.in/pilgrimages/");
		//System.out.println(driver.findElementByXPath("//div[@class='opening']/h1").getText());
		System.out.println("testcase 2");

	}

}
