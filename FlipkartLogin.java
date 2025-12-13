package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//a[@class='_1jKL3b']")).click();
		
		driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']")).sendKeys("8345945508");
		
		driver.findElement(By.xpath("//button[@class='dSM5Ub Kv3ekh KcXDCU']")).click();

	}

}
