package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDynamicElement2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
       
        
        driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
        

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("mad");
        driver.findElement(By.xpath("//input[@value='Show me']")).click();
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        
       // WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passnew']")));
        
        WebElement a=driver.findElement(By.xpath("//input[@id='passnew']"));
        
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(a));
        
        
        element.sendKeys("maddy");
        
        
        
	}
	
}
