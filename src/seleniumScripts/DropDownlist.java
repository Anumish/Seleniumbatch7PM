package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
	//	Select objname= new Select(//location of your drop down menu or location of the element);
		Select dd= new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
		
		dd.selectByIndex(0); // Black will get selected
		
		Thread.sleep(3000);
		//Another method used to select an option from the dropdown list is:
		
		dd.selectByVisibleText("With cream");   // with cream will be selected
		
		
		// count the number of options inside the dropdown and print it in console
		
 List<WebElement> e =dd.getOptions(); // black, with cream, with sugar, with cream & sugar , crisp
		// to print the number of values in the drop down list
int size=e.size();  //5
	System.out.println(size);	
		
	
	//Assingment is to print all the options from the dropdown in console
	
	}

}
