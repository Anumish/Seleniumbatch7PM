package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// provide the path of out browser driver that we downloaded from web.
		// geckodriver and chrome driver

		// drivers are responsible to create a session between client and browser.
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		// To check if We are able to open Chrome browser
		
		// creating a reference variable so as to access the methods of WebDriver class
	
		
		WebDriver driver = new ChromeDriver();
	
		// get() method is used to open a webpage on a browser
		
		driver.get("https://selenium.dev/downloads/");
		
		
		
		
		
	}

}
