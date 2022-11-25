package day3;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class MyFirstSeleniumScript {


public void main(){
        
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Ravi M");
        
        String title=driver.getTitle();
        System.out.println("Title is "+ title);
        String url = driver.getCurrentUrl();
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
        System.out.println("URL is "+url);
    

   }



}