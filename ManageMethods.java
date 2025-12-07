package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class ManageMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Dimension dimension = driver.manage().window().getSize();
        System.out.println("Dimension of browser window:" + dimension);
        System.out.println("Height of browser window:" + dimension.getHeight());
        System.out.println("Width of browser window:" + dimension.getWidth());
        
        driver.manage().window().setSize(new Dimension(300, 500));
        
        Point point = driver.manage().window().getPosition();
        System.out.println("Point of browser window:" + point);
        System.out.println("x-coordinate of browser window:" + point.getX());
        System.out.println("y-coordinate of browser window:" + point.getY());
        
        driver.manage().window().setPosition(new Point(500, 500));
	}

}
