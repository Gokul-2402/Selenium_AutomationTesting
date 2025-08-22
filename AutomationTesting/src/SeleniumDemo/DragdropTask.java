package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdropTask {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions action = new Actions(Driver);
		WebElement webdrag = Driver.findElement(By.xpath("//li[@data-id='2']"));
		WebElement webdrop = Driver.findElement(By.id("amt8"));
		
		WebElement webdrag1 = Driver.findElement(By.xpath("//li[@data-id='5']"));
		WebElement webdrop2 = Driver.findElement(By.id("bank"));
		action.dragAndDrop(webdrag1, webdrop2).build().perform();
		action.dragAndDrop(webdrag, webdrop).build().perform();
		
		webdrag.click();
	}

}
