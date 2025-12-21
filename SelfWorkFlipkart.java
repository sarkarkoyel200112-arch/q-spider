package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement searchProducts = driver.findElement(By.xpath("//input[@class='lNPl8b']"));
		searchProducts.sendKeys("TV");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='kV1UjG']"));
		searchButton.click();
		
		WebElement pricePrint = driver.findElement(By.xpath("//div[@class='RG5Slk']/../../..//div[@class='hZ3P6w DeU9vF']"));
		System.out.println(pricePrint.getText());
		
		

	}

}
