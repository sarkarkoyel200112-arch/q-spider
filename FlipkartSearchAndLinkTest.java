package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchAndLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		
		driver.findElement(By.xpath("//input[starts-with(@name,'q')]")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath("//button[starts-with(@class,'_2iLD')]")).click();
		
		//driver.findElement(By.xpath("//a[ends-with(text(),'Seller')]")).click();
		
		driver.findElement(By.xpath("//a[starts-with(@class,'wI1dRI')]")).click();
		
		

	}

}
