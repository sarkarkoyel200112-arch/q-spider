package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAbsoluteXpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/ul/li[2]/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/ul/li[4]/a")).click();

	}

}
