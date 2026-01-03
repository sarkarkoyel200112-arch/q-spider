package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettersMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		System.out.println(ele.getText());
		
		WebElement ele6 = driver.findElement(By.linkText("Register"));
		System.out.println(ele6.getCssValue("color"));
		
		WebElement ele7 = driver.findElement(By.linkText("Register"));
		System.out.println(ele7.getCssValue("font-size"));
		
		WebElement ele8 = driver.findElement(By.linkText("Register"));
		System.out.println(ele8.getAccessibleName());
		
		WebElement ele2 = driver.findElement(By.id("small-searchterms"));
		ele2.sendKeys("Mobiles");
		System.out.println(ele2.getDomAttribute("value"));
		System.out.println(ele2.getDomProperty("value"));
		
		Point ele3 = driver.findElement(By.id("small-searchterms")).getLocation();
		System.out.println(ele3);
		System.out.println(ele3.getX());
		System.out.println(ele3.getY());
		
		Rectangle ele4 = driver.findElement(By.id("small-searchterms")).getRect();
		System.out.println(ele4);
		System.out.println(ele4.getDimension());
		System.out.println(ele4.getHeight());
		System.out.println(ele4.getWidth());
		System.out.println(ele4.getPoint());
		System.out.println(ele4.getX());
		System.out.println(ele4.getY());
		
		WebElement ele9 = driver.findElement(By.linkText("Shopping cart"));
		System.out.println(ele9.getAccessibleName());
	}

}
