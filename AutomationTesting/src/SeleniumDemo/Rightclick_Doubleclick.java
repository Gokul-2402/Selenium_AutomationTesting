 package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rightclick_Doubleclick {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		
		//implicit wait it wait for maximum of 10 seconds if the element find on 2 seconds it will enter it is also called as global wait 
		//because it is wo\rk on all the elemnets in script
//		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		Driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		WebElement user = Driver.findElement(By.id("email"));
		user.sendKeys("Gokul");
		WebDriverWait Wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
		Wait.until(ExpectedConditions.visibilityOf(user));
		Actions actions = new Actions(Driver);
		actions.moveToElement(user).click().build().perform();
		actions.contextClick(user).build().perform();

	}

}
