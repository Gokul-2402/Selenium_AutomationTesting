package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabhandlingDemo {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		String pw = Driver.getWindowHandle();
		Driver.get("https://www.changepond.com/");
		Driver.switchTo().newWindow(WindowType.TAB);
		String cw = Driver.getWindowHandle();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.switchTo().window(pw);
		
		
		//Driver.manage().window().maximize();
		
	
	}

}
