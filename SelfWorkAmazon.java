package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[contains(text(), 'Account & Lists')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("koyels586@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

	}

}
