package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	driver.findElement(By.name("userName")).sendKeys("abcd@344");;
		
	//	driver.findElement(By.name("password")).sendKeys("passowrd123");
		
		Actions action= new Actions(driver);
		//Enter data in password field using Tab action from keyboard
		//First press tab, focus will be on password text box
		action.sendKeys(Keys.TAB).build().perform();
		//Second enter password in the text box
		action.sendKeys("password123").build().perform();
		//Using keyboard key 'Enter' to click on signin button.
		action.sendKeys(Keys.RETURN).build().perform();
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
