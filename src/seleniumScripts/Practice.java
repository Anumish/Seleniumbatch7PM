package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;
	
	@Test
	public void IronSpider_radio()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		WebElement e=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[2]"));
		//click to select the checkbox
		e.click();
		//used to check if radio button or checkbox is selected or not.
		System.out.println(e.isSelected());
		
	}
}



