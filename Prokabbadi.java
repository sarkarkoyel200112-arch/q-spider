package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prokabbadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.prokabaddi.com/");
		
		WebElement ele = driver.findElement(By.xpath("(//p[text()='Jaipur Pink Panthers']/../../../..//p[@class='count'])[4]"));
		System.out.println(ele.getText());
		
		WebElement ele1 = driver.findElement(By.xpath("(//p[text()='Telugu Titans']/../../../..//p[@class='count'])[4]"));
		System.out.println(ele1.getText());
		
		WebElement ele2 = driver.findElement(By.xpath("(//p[text()='Bengaluru Bulls']/../../../..//p[@class='count'])[4]"));
		System.out.println(ele2.getText());
		
		//WebElement ele3 = driver.findElement(By.xpath("//p[text()='UP Yoddhas']/parent::div/parent::div/parent::div/parent::div/child::div[5]/child"));
		//System.out.println(ele3.getText());
		
		WebElement ele3 = driver.findElement(By.xpath("(//p[text()='Tamil Thalaivas']/parent::div/parent::div/parent::div/parent::div//p[@class='count'])[4]"));
		System.out.println(ele3.getText());
		
		WebElement ele4 = driver.findElement(By.xpath("(//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']/descendant::p[@class='count'])[3]"));
		
		System.out.println(ele4.getText());
		
		
	}

}
