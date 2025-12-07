package day2Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopToTwitterNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Twitter")).click();
		
		String parentID = driver.getWindowHandle();
		System.out.println("Parent ID of the web page: " + parentID);
		
		Set<String> childID = driver.getWindowHandles();
		System.out.println("Child ID of the web page: " + childID);

	}

}
