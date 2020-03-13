package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		// findElement method
		// Username Text Box
		
		// driver.findElement(By.id("wpName2"))-- used to locate an element on webpage
		//driver.findElement(By.id("wpName2")).sendKeys() --performing an action on the element 
		
		// enter text for username field 
		driver.findElement(By.id("wpName2")).sendKeys("Sonal");
		
          // clear() method   -- clearing the text available in textbox
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("wpName2")).clear();
		
		
		Thread.sleep(3000);
		
		// finding an element -- findElement method
		//locating an element using -- By.locatorname("value")
		// then performing an action --using sendkeys() method  // this method is used to enter data in text box
		
		driver.findElement(By.id("wpPassword2")).sendKeys("abc@123");
		
		
		
		Thread.sleep(2000);

	}

}
