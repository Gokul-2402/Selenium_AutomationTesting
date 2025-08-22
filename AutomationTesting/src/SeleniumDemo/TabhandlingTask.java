package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabhandlingTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		String Tab1 = Driver.getWindowHandle();
		Driver.get("https://www.changepond.com/");
		
		
		Driver.switchTo().newWindow(WindowType.TAB);
		String tab2 = Driver.getWindowHandle();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver.switchTo().newWindow(WindowType.TAB);
		String tab3 = Driver.getWindowHandle();
		Driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		
		Thread.sleep(1000);
		Driver.switchTo().window(Tab1);
		Thread.sleep(1000);
		Driver.switchTo().window(tab2);
		Thread.sleep(1000);
		Driver.switchTo().window(tab3);
		Thread.sleep(1000);
		Driver.switchTo().window(tab2);
		Thread.sleep(1000);
		Driver.switchTo().window(Tab1);
		Thread.sleep(1000);
		Driver.switchTo().window(tab3);
		Thread.sleep(1000);
		
		Driver.switchTo().window(tab3).close();
		Thread.sleep(2000);
		Driver.quit();
		

	}

}
