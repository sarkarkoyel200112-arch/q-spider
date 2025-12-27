package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTechnique1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");
		
		driver.findElement(By.cssSelector("input.button-1")).click();
		
		driver.findElement(By.cssSelector("a[href^='/conditions-of-use']")).click();
		
		driver.findElement(By.cssSelector("a[href^='/recentlyviewedproducts']")).click();
		
		driver.findElement(By.cssSelector("a[href$='/compareproducts']")).click();
		
		driver.findElement(By.cssSelector("a[href$='/shipping-returns']")).click();
		
		driver.findElement(By.cssSelector("div[class='header-links']>ul>li:nth-child(1)")).click();
		
		driver.findElement(By.cssSelector("div[class='header-links']>ul>li:nth-child(2)")).click();
		
		driver.findElement(By.cssSelector("div[class='header-links']>ul>li:nth-child(3)")).click();
		
		driver.findElement(By.cssSelector("div[class='header-links']>ul>li:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("div[class='column information']>ul>li:nth-child(3)>a")).click();

	}

}
