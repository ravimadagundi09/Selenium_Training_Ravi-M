package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript2 {
	
	@Test

	public static void main() {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username=driver.findElement(By.name("email1"));
		username.sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		driver.findElement(By.className("submit-btn")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("courses"));
		

	}

}
