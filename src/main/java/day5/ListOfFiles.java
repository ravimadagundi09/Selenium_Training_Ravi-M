package day5;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ListOfFiles {
   public static void main(String args[]) throws IOException {
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/download");
	   driver.findElement(By.xpath("//a[normalize-space()='DateTime.txt']"));
	   
      //Creating a File object for directory
      File directoryPath = new File("C:\\Users\\ravm2\\Desktop\\Autoit");
      //List of all files and directories
      String contents[] = directoryPath.list();
      System.out.println("List of files and directories in the specified directory:");
      for(int i=0; i<contents.length; i++) {
         System.out.println(contents[i]);
      }
   }
}