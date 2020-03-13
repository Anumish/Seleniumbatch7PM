package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitScript {
	
	@Test
	public void method1()
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//Implicit wait
	
	//beofre throwing No element found exception , wait for 3 seconds
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	//locate a textbox and send keys
	
	//Explicit wait : wait time(10 sec)   2. condition(Visibility of clickable element)
	//after 10 sec , the elemnt to be clicked is not visible
	// than throw no element found exception
	
	WebDriverWait w= new WebDriverWait(driver, 5);
	w.until(ExpectedConditions.alertIsPresent());
	
	//locate link is aviable or not and click on it
	
	
	/* FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(10))
			    // if the element is not visible for 10 seconds, the tool is going to poll the website for another 5 seconds
			    //beofre throwing no such element found exception
			          .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			          
			   
			   WebElement element = wait.until(new Function<WebDriver, WebElement>() 
			     {
			   public WebElement apply(WebDriver driver) {
			   WebElement element = driver.findElement(By.xpath(""));
			   return element;
			   }
			     });*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
