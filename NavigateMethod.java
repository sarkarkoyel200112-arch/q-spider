package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		
		driver.navigate().to(new URL("https://www.instagram.com/"));
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
	}

}
