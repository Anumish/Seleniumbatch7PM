package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action= new Actions(driver);
	Thread.sleep(3000);	
	/*	action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(
driver.findElement(By.id("droppable"))).release().build().perform();*/
			
		//OR
		WebElement e=driver.findElement(By.id("draggable"));
		WebElement e1= driver.findElement(By.id("droppable"));
	//Double click Mouse action
		action.doubleClick(e);
		//Right click on the element
		action.contextClick(e1);
		//Drag and drop
		action.dragAndDrop(e, e1).build().perform();
		
		//resizing on webpage
		driver.navigate().to("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
	WebElement	r=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		action.clickAndHold(r).moveByOffset(100, 60).release(r).build().perform();
		
		driver.close();
		
		}

}
