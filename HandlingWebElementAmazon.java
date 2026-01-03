package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> eleButton = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		
		for(WebElement elementButton : eleButton) {
			elementButton.click();
		}

	}

}
