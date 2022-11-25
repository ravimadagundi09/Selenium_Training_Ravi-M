package day3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.out.println("running before method-creating brower session");
        driver=new ChromeDriver();
        driver.get("http://137.184.76.209/orangehrm-4.9\n");
    }
    @AfterMethod
    public void tearup() {
        driver.quit();
        System.out.println("after method");
    }
  @Test
  public void onlyUsername() {
  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  String a="Password cannot be empty";
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@type='submit' and contains(@id, 'Login')]//following::span[1]")).getText(), a);
 }
  @Test
  public void onlyPassword() {
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  String a="Username cannot be empty";
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@type='submit' and contains(@id, 'Login')]//following::span[1]")).getText(), a);
 }
  
  @Test
  
  public void validCredentials() {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	  
  }
  @Test
  
  public void noCredentials() {
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  String a="Username cannot be empty";
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@type='submit' and contains(@id, 'Login')]//following::span[1]")).getText(), a);
	  
  }
}