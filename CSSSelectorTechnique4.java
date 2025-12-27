package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTechnique4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		
		driver.findElement(By.cssSelector("div[class='search-box'] input[id='small-searchterms']")).sendKeys("Mobiles");
		
		driver.findElement(By.cssSelector("div[class='search-box'] input[value='Search']")).click();
		
		driver.findElement(By.cssSelector("div[class='header-links'] a[class='ico-login']")).click();
		
		driver.findElement(By.cssSelector("div[class='form-fields'] input[id='Email']")).sendKeys("koyels229@gmail.com");
		
		driver.findElement(By.cssSelector("div[class='column information'] + div a[href='/compareproducts']")).click();

	}

}
