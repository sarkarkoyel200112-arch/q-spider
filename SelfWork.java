package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelfWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		String actual_title = "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
		if(actual_title.equals(driver.getTitle())) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println("Dimensions of Browser window: " + size);
		System.out.println("Height of Browser window: " + size.getHeight());
		System.out.println("Width of Browser window: " + size.getWidth());
		
		driver.manage().window().setSize(new Dimension(400,800));
		
		Point point = driver.manage().window().getPosition();
		
		System.out.println("Position of Browser window: " + point);
		System.out.println("x-coordinate of browser window: " + point.getX());
		System.out.println("y-coordinate of browser window: " + point.getY());
		
		driver.manage().window().setPosition(new Point(500, 500));
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
