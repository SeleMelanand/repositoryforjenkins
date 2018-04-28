package com.selenium.diffbrowsers;

import java.io.IOException;
import java.util.regex.Pattern;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase02 extends InvokeBrowsers {
	
	@BeforeClass
	public void testcasedata() {
		testcasename="tc02kpntravels";
		testcasedescription = "launching kpn travels site";
	}
//(priority = 2)
	@Test
	public void kpntravels() throws IOException {
		
		/*driver.get("http://kpntravels.in/");
		System.out.println("Titla of thee apge is -"+ driver.getTitle());
		String abc = driver.findElementByXPath("//div[@class='content-about']/div/div[2]/div/h3").getText();
		if (abc.equalsIgnoreCase("Plan Your Travel")) {
			status = "pass";
		} else {
			status = "fail";
		}*/
		
		
		
		
	}
}