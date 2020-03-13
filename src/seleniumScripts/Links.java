package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver;
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		
		// LinkText Locator- value for this locator is the text present in between the <a>   </a> tags.
		
		String text= driver.findElement(By.linkText("Main page")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.linkText("Main page")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		String text2= driver.findElement(By.linkText("Create account")).getText();
				System.out.println(text2);		
				
		driver.findElement(By.linkText("Create account")).click();
		System.out.println(driver.getTitle());
		
		
		
	}

}
