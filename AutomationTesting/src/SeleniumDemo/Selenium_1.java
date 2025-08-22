package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Selenium_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();// Open Firefox browser.
		//WebDriver wd1 = new ChromeDriver(); // open Chrome browser.
		String link = " https://www.changepond.com/";
		wd.get(link);
		wd.manage().window().maximize();
		Thread.sleep(10000);
		//wd.manage().window().minimize();
		 System.out.println(wd.getTitle());
		 System.out.println(wd.getCurrentUrl());
		 System.out.println(wd.getWindowHandle());
		 System.out.println(wd.getPageSource());
		 
		wd.close();
		
	}

}
