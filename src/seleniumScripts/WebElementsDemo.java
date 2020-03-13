package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver;
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		
		// WebElement : is an Object in selenium which can store the location of the element
		
	WebElement	e= driver.findElement(By.id("wpName2"));   // storing the location of Username text field
		
	// isEnabled() method is used to check if the particular element is enabled for us to enter data or not.
	// If it is disable it will give output as False
	// this method return a boolean output
		
	// isDisplayed() method is used to check if the element is displayed on the webpage or not
			
	Boolean displayed=e.isDisplayed();
	
	System.out.println(displayed);
	
		Boolean enable= e.isEnabled();  // true
		System.out.println(enable);
		
		if(enable==true)
		{
		e.sendKeys("Sonal");
		e.clear();
		e.sendKeys("Testing");
		
		}
		
		
		// one of the ways to perform multiple operation on a single elelemnt
		
		 driver.findElement(By.id("wpPassword2")).isDisplayed();
		 driver.findElement(By.id("wpPassword2")).isEnabled();
		 driver.findElement(By.id("wpPassword2")).clear();
		 driver.findElement(By.id("wpPassword2")).sendKeys("Sonal");
		 driver.findElement(By.id("wpPassword2")).clear();
		
		
		
		// storing the location of elelment in an object
		 // using this object we can call all the operation methods on the element
		
		
		WebElement e1= driver.findElement(By.id("wpPassword2"));
		
		
		e1.isDisplayed();
		e1.isEnabled();
		e1.sendKeys("sonal");
		
		
		WebElement e2= driver.findElement(By.id("wpRetype"));
		
		e2.isDisplayed();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
