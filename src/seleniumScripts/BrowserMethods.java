package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		
		
		WebDriver driver=  new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3AContributions%2F122.177.179.179");
		
	
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		System.out.println("navigating to selenium Hq webpage");
		
		// In order to navigate from current webpage to another webpage use method : navigate.to()
		
		driver.navigate().to("https://selenium.dev/");
		
		String title= driver.getTitle();
		
		System.out.println("Title of selenium HQ page" + title);
		
		// method to go Back to previous webpage
		
		driver.navigate().back();
		
		
		System.out.println(driver.getTitle()); // wiki page
		
		// method to navigate forward to next page
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());    // selenium page
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
