package seleniumScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrolling {
	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		
		 JavascriptExecutor	js=((JavascriptExecutor)driver);
		 //Scrolling until the lement is visible
		 
		
		    WebElement e=driver.findElement(By.linkText("3.141.59"));
		    js.executeScript("arguments[0].scrollIntoView(true);",e);  
		    Thread.sleep(3000);
		    e.click();
		    takeScreenshot("imageclick saucelabs");
		      
	}
	public static void takeScreenshot(String filename) throws Exception{
		
        //Convert web driver object to TakeScreenshot

        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //Copy file at destination
        File f1= new File("C:\\Users\\vishal mittal\\workspace\\SeleniumTraining9PM\\src\\seleniumScripts"+filename+".jpg");
            FileHandler.copy(f,f1);

}
	
	 
}
