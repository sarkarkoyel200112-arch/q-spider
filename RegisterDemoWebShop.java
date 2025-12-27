package day9Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.cssSelector("input[id^='gender-female']")).click();
		
		
		driver.findElement(By.cssSelector("input[id^='FirstName']")).sendKeys("Koyel");
		driver.findElement(By.cssSelector("input[id^='FirstName']")).clear();
		
		driver.findElement(By.cssSelector("input[id^='LastName']")).sendKeys("Sarkar");
		driver.findElement(By.cssSelector("input[id^='LastName']")).clear();
		
		driver.findElement(By.cssSelector("input[id^='Email']")).sendKeys("sarkarkoyel200112@gmail.com");
		driver.findElement(By.cssSelector("input[id^='Email']")).clear();
		
		driver.findElement(By.cssSelector("input[id^='Password']")).sendKeys("Ks_5arkar");
		driver.findElement(By.cssSelector("input[id^='Password']")).clear();
		
		driver.findElement(By.cssSelector("input[id^='ConfirmPassword']")).sendKeys("Ks_5arkar");
		driver.findElement(By.cssSelector("input[id^='ConfirmPassword']")).clear();
		
		driver.findElement(By.cssSelector("input[type='submit'][id='register-button']")).submit();

	}

}
