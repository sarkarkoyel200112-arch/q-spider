package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		boolean ele = driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
		System.out.println(ele);

	}

}
