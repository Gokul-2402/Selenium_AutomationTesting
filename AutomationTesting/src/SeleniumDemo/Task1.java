package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdBytiP7L8qJGNODXIgjRf15zoyp3lkIGUa2J_RzZYmAyPWyqVb1A3j5yTwmXC8sBZ6EF72I-clKkw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-969091540%3A1755585008692206");
		wd.manage().window().minimize();
		String title = wd.getTitle();
		System.out.println(title);
		String result=title.equals("Gmail") ? "Passed" : "failed";
		System.out.println(result);
		System.out.println(wd.getCurrentUrl());
		Thread.sleep(5000);
		wd.close();
		
	}

}
