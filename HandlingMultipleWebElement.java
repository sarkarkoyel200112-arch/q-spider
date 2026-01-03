package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement element : ele) {
			System.out.println(element.getText());
			Thread.sleep(3000);
			element.click();
			
			
		}
	}

}
