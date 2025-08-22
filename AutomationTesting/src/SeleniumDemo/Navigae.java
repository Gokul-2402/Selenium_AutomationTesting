package SeleniumDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigae {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.w3schools.com/");
		
		Driver.get("https://www.tpointtech.com/java-tutorial");
		Thread.sleep(3000);
		Driver.navigate().back();
		Thread.sleep(3000);
		Driver.navigate().forward();
		//Driver.navigate().refresh();
		 Dimension size = Driver.manage().window().getSize();	
		 System.out.println(size);
		}

}
