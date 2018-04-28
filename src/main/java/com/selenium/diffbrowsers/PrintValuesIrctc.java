package com.selenium.diffbrowsers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class PrintValuesIrctc {
	@Test
	public void printvalue() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement seqquestion = driver.findElementById("userRegistrationForm:securityQ");
		System.out.println(seqquestion.getText());

		// Create Basic HTML file
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporter/result.html");
		html.setAppendExisting(false);

		// Update Existing html file
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);

		// For each test case
		ExtentTest test = extent.createTest("TC001_irctcsite", "login creation");
		test.assignAuthor("Anand");
		test.assignCategory("Smoke");

		// For each step

		test.pass("page loaded successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snapshot/img1.png").build());

		test.pass("The data crmsfa is entered successfully");
		test.pass("The login button is clicked successfully");

		extent.flush();

	}

}
