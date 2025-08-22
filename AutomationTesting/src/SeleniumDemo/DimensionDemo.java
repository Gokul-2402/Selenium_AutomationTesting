package SeleniumDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DimensionDemo {

	public static void main(String[] args) {
		WebDriver Driver = new FirefoxDriver();
		Dimension dimen = new Dimension(500,700);
		Driver.manage().window().setSize(dimen);
		Driver.get("https://accounts.saucelabs.com/am/XUI/");

	}

}
