package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com/");
		
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//Thread.sleep(4000);
		
		// switch from main windoe to alert box
	
		
	Alert a	=driver.switchTo().alert();
	
	// To fetch the message from the alert box
	
	String errmsg=a.getText();
	
	System.out.println(errmsg);
	
	// to Click on OK button in an Alert
	Thread.sleep(3000);
	a.accept();
	
	// to Click on Cancel button in an Alert
	
	//a.dismiss();
	
	// This method will be used only if there is a text field in the alert box
	
	//a.sendKeys("Selenium");
	
	
	
	
	
	
	
		
		
		
	}

}
