package day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/?zx=1765300744047&no_sw_cr=1");
		
		driver.findElement(By.cssSelector("span[class='PD3zdc z1asCe']")).click();

	}

}
