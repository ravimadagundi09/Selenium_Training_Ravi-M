package day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
  @Test
  public void login() {
	  Assert.assertTrue(true);
	  System.out.println("login done");
  }
  @Test(dependsOnMethods="login")
  public void creat() {
	  System.out.println("Account created");
	  
  }
}
