package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsHub {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		   driver.findElement(By.xpath("//input[@placeholder='enter name']")).sendKeys("mad");
	}

}
