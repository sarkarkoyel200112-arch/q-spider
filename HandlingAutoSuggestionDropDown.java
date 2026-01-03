package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com/"); 
		driver.findElement(By.id("small-searchterms")).sendKeys("computer"); 
		Thread.sleep(1000); 
		List<WebElement> ele = driver.findElements(By.xpath("//a[@class='ui-corner-all']")); 
		Thread.sleep(1000); 
		for (WebElement element : ele) { 
			System.out.println(element.getText()); 
			if (element.getText().contains("Simple Computer")) { 
				element.click(); 
				} 
			} 
		} 
	}

