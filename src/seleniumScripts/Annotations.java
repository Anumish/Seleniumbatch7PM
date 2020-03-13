package seleniumScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void login()
	{
		System.out.println("loginto the application");
	}
	
	@Test
	public void createmail()
	{
		System.out.println("create mail in the application");
	}

	@Test
	public void search()
	{
		System.out.println("search mail in the application");
	}
	@Test
	public void delete()
	{
		System.out.println("delete mail in the application");
	}
	
	@AfterMethod
	
	public void logout()
	{
		System.out.println("logout the application");
	}
	
}
