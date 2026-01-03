package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		
		Thread.sleep(1000);
		
		List<WebElement> eleList = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		Thread.sleep(1000);
		for(WebElement elementList : eleList) {
			System.out.println(elementList.getText());
			Thread.sleep(1000);
			if(elementList.getText().contains("mobiles under 15000 5g phones")) {
				elementList.click();
				break;
			}
		}
        Thread.sleep(1000);
        driver.quit();
	}

}
