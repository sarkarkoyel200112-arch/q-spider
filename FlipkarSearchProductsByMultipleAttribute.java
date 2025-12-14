package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkarSearchProductsByMultipleAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='q' and @class='Pke_EE']")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2iLD__']")).click();
	}

}
