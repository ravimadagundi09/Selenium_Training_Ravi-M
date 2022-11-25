package day3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DateTask1 {


@Test
   public static void main()throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='25']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("how-to-handle-calendar-in-selenium.html"));
    }



}