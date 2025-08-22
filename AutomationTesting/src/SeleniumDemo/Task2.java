package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Register.html");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Gokul");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("v");
		Driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("9/38 siruseri changepond");
		Driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("gokul123@gmail.com");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8072598232");
		Driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();
		
		
		Driver.findElement(By.id("checkbox2"));
		Driver.findElement(By.id("msdd")).click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();
		Thread.sleep(2000);
		Select s= new Select (Driver.findElement(By.id("Skills")));
		s.selectByVisibleText("Python");
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		
		Thread.sleep(2000);
		
		Driver.close();
	}

}
