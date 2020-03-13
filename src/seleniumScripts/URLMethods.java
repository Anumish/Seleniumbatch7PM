package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3AContributions%2F122.177.179.179");
		
		// Method to fetch the title of the webpage
		
		String title= driver.getTitle();
		
		System.out.println("Title of the page is : "+ " "+ title);
		
		// Method to fetch the current url of the webpage
		
		String url=driver.getCurrentUrl();
		
		System.out.println("URL of the page is :" +" "+ url);
		
		
	
	/*	
		// Assignment : write if else block with conditions to verify if the title fetched is same as expected or not.
		
		if(url.contains("Special:CreateAccount"))
		{
			
		}
		
		if(title.equals("Create Account - Wikipedia"))
		{
			
		}*/
		
		
		
		
		

	}

}
