package day10;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		System.out.println(ele1.getText());
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Myntra']"));
		System.out.println(ele2.getText());
		
		WebElement ele3 = driver.findElement(By.className("iyMZqb"));
		System.out.println(ele3.getAttribute("href"));
		
		WebElement ele4 = driver.findElement(By.className("u4vC36"));
		System.out.println(ele4.getAttribute("title"));
		
		WebElement ele5 = driver.findElement(By.xpath("//a[@class='u4vC36']"));
		System.out.println(ele5.getTagName());
		
		WebElement ele6 = driver.findElement(By.linkText("Login"));
		System.out.println(ele6.getCssValue("color"));
		
		WebElement ele7 = driver.findElement(By.linkText("Login"));
		System.out.println(ele7.getCssValue("font-size"));
		
		WebElement ele8 = driver.findElement(By.className("lNPl8b"));
		ele8.sendKeys("mobiles");
		System.out.println(ele8.getSize());
		
		System.out.println(ele8.getDomAttribute("value"));
		System.out.println(ele8.getDomProperty("value"));
		
		Dimension ele9 = driver.findElement(By.xpath("//a[text()='Become a Seller']")).getSize();
		System.out.println(ele9);
		System.out.println(ele9.getHeight());
		System.out.println(ele9.getWidth());
		
		Point ele10 = driver.findElement(By.xpath("//button[@class='kV1UjG']")).getLocation();
        System.out.println(ele10);
        System.out.println(ele10.getX());
        System.out.println(ele10.getY());
        
        Rectangle ele11 = driver.findElement(By.xpath("//a[text()='Cleartrip']")).getRect();
        System.out.println(ele11);
        System.out.println(ele11.getDimension());
        System.out.println(ele11.getHeight());
        System.out.println(ele11.getWidth());
        System.out.println(ele11.getPoint());
        System.out.println(ele11.getX());
        System.out.println(ele11.getY());
        
        @Nullable
		String ele12 = driver.findElement(By.xpath("//a[text()='Login']")).getAriaRole();
        System.out.println(ele12);
        
        @Nullable
		String ele13 = driver.findElement(By.xpath("//button[@class='kV1UjG']")).getAriaRole();
        System.out.println(ele13);
	}

}
