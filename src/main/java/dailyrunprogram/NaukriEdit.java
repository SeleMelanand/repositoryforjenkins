package dailyrunprogram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


// Contact address in line #35 shoudl eb edited before the ever run 
public class NaukriEdit {
	@Test
	public void naukriedit() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		String basewindow = driver.getWindowHandle();

		Set<String> windowgroup = driver.getWindowHandles();
			

		for (String eachwindow : windowgroup) {
			if (eachwindow.equalsIgnoreCase(basewindow)) {
				System.out.println("we are in base window");
			}
			else{
				driver.switchTo().window(eachwindow);
				driver.close();
			}
		}
		driver.switchTo().window(basewindow);

		driver.findElementByXPath("//div[text()='Login']").click();

		driver.findElementByXPath("//input[@name='email']").sendKeys("ananth.testing@yahoo.com");
		driver.findElementById("pLogin").sendKeys("ssg@1234", Keys.ENTER);

		driver.findElementByLinkText("UPDATE PROFILE").click();

		driver.findElementByXPath("//span[text()='Personal Details']").click();
		
		driver.findElementByXPath("(//span[text()='Edit'])[14]").click();
		
		driver.findElementById("pd-permanent-address").clear();
		driver.findElementById("pd-permanent-address").sendKeys("Pondicherry");
		driver.findElementById("savePersonalDetailsBtn").click();
		
		
		
		//driver.findElementByXPath("//button[@value='Save Changes']").click();

		/*driver.findElementByLinkText("My Naukri Home").click();

		System.out.println(driver.findElementByXPath("//div[@id='compDetail']/div[4]/div[2]").getText());
*/
	}

}
