package day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript3 {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		//Options opt=driver.manage();
		//Window win=opt.window();
		//win.maximize();
		
		
		
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("name"));
		username.sendKeys("Ravi M");
		driver.findElement(By.id("email")).sendKeys("ravimadagundi09@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		
		Thread.sleep(3000);
		WebElement blockchain=driver.findElement(By.xpath("//label[normalize-space()='Testing']"));
		blockchain.click();
		//WebElement iOSDevelopment=driver.findElement(By.xpath("//label[normalize-space()='iOS Development']"));
		//iOSDevelopment.click();
		
		WebElement gender=driver.findElement(By.xpath("//div[@class='genders-div']//div[1]"));
		gender.click();
		
		//WebElement sateDropdown=driver.findElement(By.name("state"));
		
		
	}

}
