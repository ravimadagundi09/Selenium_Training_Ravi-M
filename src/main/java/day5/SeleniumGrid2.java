package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SeleniumGrid2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()  {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability("browserName", "Safari");
		capabilities.setCapability("browserVersion", "16.0");
		capabilities.setCapability("os", "OS X");
		capabilities.setCapability("osVersion", "Ventura");
		//capabilities.setCapability("browserName", "Chrome");
		URL url=null;
		try {
			url=new URL("https://ravi_qAPbVC:xakZxExLfQ2BPzxizcKZ@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver=new RemoteWebDriver(url,capabilities);
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void ineuron() {
		driver.get("https://ineuron-courses.vercel.app/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/login"));
	}
	
	
	
	
	

}
