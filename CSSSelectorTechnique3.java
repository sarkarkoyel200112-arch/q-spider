package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTechnique3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		
		driver.findElement(By.cssSelector("div[class='column information']>ul>li:nth-child(3)>a")).click();
		
		driver.findElement(By.cssSelector("div[class='column information']>ul>li:nth-child(5)>a")).click();

	}

}
