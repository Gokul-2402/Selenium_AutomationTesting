package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementDemo {

	public static void main(String[] args) {
		WebDriver Wd = new ChromeDriver();
		Wd.get("https://demo.automationtesting.in/Register.html");
		Wd.manage().window().maximize();
		WebElement We = Wd.findElement(By.xpath("//input[@placeholder='First Name']"));
		We.click();
		We.sendKeys("Gokul");
		//We.clear();
		System.out.println(We.isEnabled());
		System.out.println(We.isDisplayed());
		WebElement radiobutton = We.findElement(By.xpath("//input[@value='Male']"));
		System.out.println(radiobutton.isEnabled());
		System.out.println(radiobutton.isSelected());
		System.out.println(radiobutton.getTagName());
		System.out.println(radiobutton.getSize());
		System.out.println(We.getAttribute("value"));
		
		
		WebElement dropdown = Wd.findElement(By.id("state"));
		//System.out.println(dropdown.get);
		
		

	}

}
