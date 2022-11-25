package day5;

import org.testng.annotations.Test;


import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SeleniumGrid1 {
	
	WebDriver driver;
	
	
	@Parameters({"os","osVersion","browser","browserVersion"})
	@BeforeMethod
	public void setup(String os,String osVersion,String browser,String browserVersion)  {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("browserVersion", browserVersion);
		capabilities.setCapability("os", os);
		capabilities.setCapability("osVersion", osVersion);
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
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/login"));
	}
	
	
	
	
	
	

}
