package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class User {
	@BeforeClass
	public void OpenBrowser()
	{
		System.out.println("Browser Opened");
	}
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login");
	}
  @Test(priority=1)
  public void create() {
	  System.out.println("create user");
  }
  @Test(priority=2)
  public void edit() {
	  System.out.println("edit user");
  }
  @Test(priority=3)
  public void modify() {
	  String act="Swarn";
	  String exp="Neha";
	  Assert.assertEquals(act, exp);
	  System.out.println("modify user");
  }
  @Test(dependsOnMethods="modify")
  public void delete() {
	  System.out.println("delete user");
  }
  
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout");
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Browser Closed");
	}
}
