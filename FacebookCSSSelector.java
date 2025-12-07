package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?");
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Koyel");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sarkar");
		driver.findElement(By.cssSelector("select[name='birthday_day']")).sendKeys("12");
		driver.findElement(By.cssSelector("select[name='birthday_month']")).sendKeys("May");
		driver.findElement(By.cssSelector("select[name='birthday_year']")).sendKeys("2001");
		driver.findElement(By.cssSelector("input[name='sex'][value='1']")).click();
		
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("koyels229@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Koyels_5arkar");
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

	}

}
