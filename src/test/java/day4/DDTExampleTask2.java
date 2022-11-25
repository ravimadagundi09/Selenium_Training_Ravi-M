package day4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class DDTExampleTask2{
    
    
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.out.println("running before method-creating brower session");
        driver=new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/login");
    }
    
    @AfterMethod
    public void tearup() {
        driver.quit();
        System.out.println("after method");
    }
    
  @Test(dataProvider="testdata")
  public void myTest(String username,String password) throws InterruptedException{
      
      driver.findElement(By.name("email1")).sendKeys(username);
        driver.findElement(By.id("password1")).sendKeys(password);
        
        driver.findElement(By.className("submit-btn")).click();
        Thread.sleep(3000);
        //Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='ENROLLED']")).getText().contains("ENROLLED"));
        Assert.assertEquals(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed(),true);
      
  }
  
  @DataProvider(name="testdata")
  public Object[][] testDataGeneration() throws FileNotFoundException, IOException{
	  Object [][] arr=null;
	  XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/SapientTestData.xlsx")));
	  
	  int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
	  
	  int columns=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
	  
	  arr=new Object[rows][columns];
	  
	  for(int i=0;i<rows;i++) {
		  for(int j=0;j<columns;j++) {
			  arr[i][j]=wb.getSheet("LoginData").getRow(i+1).getCell(j).getStringCellValue();
		  }
	  }
	  
      
      
    return arr;
    
    
  }
  
}