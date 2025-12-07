package day1Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTestTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String current_title = "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
		
		if(current_title.equals(driver.getTitle())) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is failed");
		}

	}

}
