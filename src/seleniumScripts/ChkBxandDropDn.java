package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChkBxandDropDn {
	
	
	// All the methods using testNG will be void, otherthan parametrization
	// This method is called as Testmethod
	// annotation is written as @Nameof the annoations
	
	WebDriver driver;
	
	//@Test(priority ='1')
	public void handlecheckbox()
	{
		// with in the method we are going to write our test case
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		boolean sel =driver.findElement(By.xpath("//input[@value='red']")).isSelected();  // False
		
		System.out.println("checkbox is selected?" +" "+ sel);
		
		driver.findElement(By.xpath("//input[@value='red']")).click();
		
	boolean select1=	driver.findElement(By.xpath("//input[@value='red']")).isSelected(); // True
	
	System.out.println("checkbox is selected?" +" "+ select1);
	
	driver.findElement(By.xpath("//input[@value='blue']")).click();
	
boolean select2=	driver.findElement(By.xpath("//input[@value='blue']")).isSelected(); // True
	
	System.out.println("checkbox is selected?" +" "+ select2);
	driver.close();
		
	}




@Test(priority ='2')
public void dropDownsMenu() throws InterruptedException
{

	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://ironspider.ca/forms/dropdowns.htm");
	
	// While creating the object of Select class, we will have pas element location as parameter
	
	
	Select dd= new Select(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select")));
	
	Thread.sleep(3000);
	
	
	//dd.selectByIndex(4);
	
	//dd.selectByVisibleText("Black");
	
	// store the entire dropdown options in an Object of type List
	// Object is going to store multiple webelement
	
	List<WebElement> obj= dd.getOptions();
	
	// it will provide number of values in the list
	
	int s=obj.size();
	
	System.out.println("Number of Values in dropdown: " + s);
	
	//printing all the values of dropdown
	
	// fetching all the options of the dropdown one by one and clicking on crisp
	Thread.sleep(3000);
	
	
	for(WebElement temp:obj)
	{
		System.out.println(temp.getText());
		
		if(temp.getText().contains("With sugar"))
		{
			temp.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












}


















