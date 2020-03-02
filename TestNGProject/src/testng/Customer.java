package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Customer {
	
  @BeforeClass
  public void openbrowser() {
	  System.out.println("Open Window");
  }
  
  @BeforeMethod
   public void login() {
	  System.out.println("Login");
  }
	@Test(priority=1)
  public void create() {
	  System.out.println("Create Customer");
  }
  @Test(enabled=false)
  public void edit() {
	  System.out.println("Edit Customer");
  }
  @Test(priority=3)
  public void delete() {
	  System.out.println("Delete Customer");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("Logout");
  }
 
  @AfterClass
  public void closebrowser() {
	  System.out.println("Close Window");
  }
}
 	 	