package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class ErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1581380861&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d803fcbe2-662c-8ea2-f6aa-93034242593b&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("idSIButton9")).click();
		
		
		
		
		// Now capture the error message displayed on the webpage
		
		String errmsg=driver.findElement(By.id("usernameError")).getText();
		
	
		
          System.out.println(errmsg);
		
		
		
	}

}
