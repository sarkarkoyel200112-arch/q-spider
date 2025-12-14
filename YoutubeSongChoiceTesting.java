package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSongChoiceTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search' or contains(text(),'Search')]")).sendKeys("Tomake Chai Arjit Singh");
		driver.findElement(By.xpath("//button[@title='Search' or @class='ytSearchboxComponentSearchButton']//div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Tomake Chai | Gangster | Yash | Mimi | Arijit Singh | Birsa Dasgupta | Latest Bengali Song 2016 4 minutes, 34 seconds' and contains(text(),'Tomake Chai')]")).click();

	}

}
