package com.selenium.diffbrowsers;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase01 extends InvokeBrowsers {

	@BeforeClass
	public void testcasedata() {
		testcasename="tc01redbus";
		testcasedescription = "launching redbus site";
	}
	
	@Test
	public void redbus() throws IOException {
		driver.get("https://www.redbus.in/pilgrimages/");
		if (driver.findElementByXPath("//section[@class='testimonials-wrapper']/div/k3").getText().contains("TRAVELLERS")) {
			status = "pass";
		} else {
			status = "fail";
		}
		System.out.println(driver.findElementByXPath("//section[@class='testimonials-wrapper']/div/h3").getText().contains("TRAVELLERS"));
	}
}