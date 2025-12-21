package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Facebook']/../following-sibling::li[@class='twitter']//a"));
		ele1.click();
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Facebook']/../following::li[@class='rss']//a"));
		System.out.println(ele2.getText());
		
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Facebook']/../following-sibling::li[@class='youtube']//a"));
		ele3.click();
		
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Facebook']/../following-sibling::li[@class='google-plus']//a"));
		System.out.println(ele4.getText());

	}

}
