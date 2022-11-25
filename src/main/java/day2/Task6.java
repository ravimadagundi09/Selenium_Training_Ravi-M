package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
        
		
      
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
       
        String msg=driver.switchTo().alert().getText();
        System.out.println(msg);
        Thread.sleep(3000);
        alert.accept();
	}
}