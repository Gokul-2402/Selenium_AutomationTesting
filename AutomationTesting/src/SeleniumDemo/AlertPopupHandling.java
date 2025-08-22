package SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement We = Driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		We.click();
		Thread.sleep(2000);
		Alert alert = Driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Driver.findElement(By.xpath("//a[text()= 'Alert with OK & Cancel ']")).click();
		
		WebElement webalert2 = Driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		webalert2.click();
		Thread.sleep(2000);
		Alert alert2 = Driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		alert.dismiss();
	}

}
