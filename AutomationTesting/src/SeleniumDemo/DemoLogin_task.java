package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin_task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Wd = new ChromeDriver();
		Wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Wd.manage().window().maximize();
		Thread.sleep(5000);
		WebElement We = Wd.findElement(By.xpath("//input[@placeholder='Username']"));
		We.click();
		//We.sendKeys("Admin");
		WebElement password = Wd.findElement(By.xpath("//input[@placeholder='Password']"));
		password.click();
		//password.sendKeys("admin123");
		WebElement button = Wd.findElement(By.xpath("//button[@type ='submit']"));
		button.click();
		WebElement Error = Wd.findElement(By.xpath("//span[text()= 'Required']"));
		System.out.println(Error.getText());
		
		Thread.sleep(5000);
		Wd.close();

	}

}
