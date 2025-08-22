package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor Je = (JavascriptExecutor)Driver;
		WebElement scroll = Driver.findElement(By.id("submitbtn"));
		Je.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(5000);
		Je.executeScript("scroll(0,-200)");
		Thread.sleep(5000);
		Driver.close();

	}

}
