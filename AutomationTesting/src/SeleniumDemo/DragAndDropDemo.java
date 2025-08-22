package SeleniumDemo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Static.html");
		Driver.manage().window().maximize();
		Actions action = new Actions(Driver);
		WebElement Drag = Driver.findElement(By.id("angular"));
		WebElement Drag1 = Driver.findElement(By.id("mongo"));
		WebElement Drag2 = Driver.findElement(By.id("node"));
		WebElement Drop = Driver.findElement(By.id("droparea"));
		action.dragAndDrop(Drag, Drop).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(Drag1, Drop).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(Drag2, Drop).build().perform();
		Thread.sleep(2000);
		

	}

}
