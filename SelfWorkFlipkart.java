package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='TVs & Appliances']")).click();
		
		driver.findElement(By.xpath("//a[@class='wI1dRI']")).click();
		
		driver.findElement(By.xpath("//span[text()='Become a Seller']")).click();
		
		driver.findElement(By.xpath("//button[text()='Start Selling']")).click();
		
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("7000592671");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("koyels586@gmail.com");
		
		driver.findElement(By.xpath("//div[text()='Only Books']")).click();

	}

}
