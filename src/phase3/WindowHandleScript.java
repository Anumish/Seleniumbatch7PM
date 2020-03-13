package phase3;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleScript {
	
	public static void main(String[] args)
	{
		
	WebDriver driver;
	
	driver= new ChromeDriver();
	
	driver.get("http://www.popuptest.com/goodpopups.html");
	
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	
	Set<String >handler= driver.getWindowHandles();
	
	Iterator<String> it= handler.iterator();
	
	// fetching the id of my parent window
	String parentwindowid=it.next();
	
	System.out.println(parentwindowid);
	// fetching the id of my child window
	String childwindowid=it.next();
	
	System.out.println(childwindowid);
	
	// switch between the windows
	
	driver.switchTo().window(childwindowid);
	
	System.out.println(driver.getTitle());
	
	driver.close(); // close the current child window
	
	// switch back to main window
	
	driver.switchTo().window(parentwindowid);
	
	System.out.println(driver.getTitle());
	
	driver.close();// close the current parent window
	
	}	

}
