package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTechnique2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[class*='lNPl8b']")).sendKeys("Mobiles");
		
		driver.findElement(By.cssSelector("button[class*='kV1UjG']")).click();

	}

}
