package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("koyelsarkar12");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Ks_12arkaroyel");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.cssSelector("a[role='link']")).click();

	}

}
