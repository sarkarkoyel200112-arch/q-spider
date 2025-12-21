package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkEbay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("iphones");
		driver.findElement(By.xpath("//button[@id='gh-search-btn']")).click();
		
		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 14 Pro ')])[2]/../../../..//span[@class='su-styled-text primary bold large-1 s-card__price']"));
        System.out.println(ele1.getText());
	}

}
