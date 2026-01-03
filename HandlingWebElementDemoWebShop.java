package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> eleLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in WebElement: " + eleLinks.size());
		
		for(WebElement elementLinks: eleLinks) {
			System.out.println(elementLinks.getText());
		}
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[contains(text(),'About us')]"));
		
		if(aboutUs.isDisplayed()) {
			aboutUs.click();
			System.out.println("About us link is click");
		}
		else {
			System.out.println("About us link is not click");
		}

	}

}
