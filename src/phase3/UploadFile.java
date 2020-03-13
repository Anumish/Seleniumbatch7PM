package phase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	@Test
	public void uploadTest()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://filebin.net/");
		
		driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\vishal mittal\\Desktop\\input.xls");
		
		
	}

}
