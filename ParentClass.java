package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		/*driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Laptop");
		
		driver.findElement(By.cssSelector(".search-box-button")).click();*/
		
		driver.findElement(By.cssSelector("input#newsletter-email")).sendKeys("koyels586@gmail.com");
		
		driver.findElement(By.cssSelector(".newsletter-subscribe-button")).click();
		
		driver.findElement(By.cssSelector("input#pollanswers-1")).click();
		
		driver.findElement(By.cssSelector(".vote-poll-button")).click();
		
		

	}

}
