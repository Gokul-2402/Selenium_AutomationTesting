package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elements_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://accounts.saucelabs.com/am/XUI/");
		Thread.sleep(5000);
		Driver.findElement(By.id("idToken1")).sendKeys("Gokul2402");
		Thread.sleep(5000);
		Driver.findElement(By.id("idToken2")).sendKeys("Gokul");
		Thread.sleep(5000);
		Driver.findElement(By.className("checkmark")).click();
		//Thread.sleep(5000);
		Driver.findElement(By.linkText("I forgot my password")).click();
		
		

	}

}
