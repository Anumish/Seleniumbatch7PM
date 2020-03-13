package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions obj= new Actions(driver);
		
		WebElement e=driver.findElement(By.id("nav-link-accountList"));
		
		obj.moveToElement(e).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[4]/span")).click();
		
		
		
		
	}

}
