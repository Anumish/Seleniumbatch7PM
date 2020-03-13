package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Grid\\chromedriver.exe");
		
		WebDriver driver;
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		
		driver.findElement(By.id("wpName2")).sendKeys("Mittal");
		
		driver.findElement(By.id("wpPassword2")).sendKeys("abc@1234");
		
		driver.findElement(By.id("wpRetype")).sendKeys("abc@1234");
		
		driver.findElement(By.id("wpEmail")).sendKeys("ab123c@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("wpCreateaccount")).click();
		
		
		// getAttribute("value") -- what ever text is available in the text box it will fetch it.
		
		// getText()  -- it just fetches the text from the webpage
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Testing");
		
		Thread.sleep(3000);
	String text	=driver.findElement(By.xpath("//input[@id='searchInput']")).getAttribute("value");
	
	System.out.println(text);	
		
			
		//driver.close();
		
		
	}

}
