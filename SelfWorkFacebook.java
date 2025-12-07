package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?");
		
		List<WebElement> sizeOfLink = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links present in Facebook registration page: " + sizeOfLink.size());
		
		List<WebElement> inputSize = driver.findElements(By.tagName("input"));
		System.out.println("Number of input field: " + inputSize.size());
		
		List<WebElement> numberOfSpan = driver.findElements(By.tagName("span"));
		System.out.println("Number of span tags: " + numberOfSpan.size());
		
		for(WebElement eleSpan : numberOfSpan) {
			System.out.println("Name of Span:" + eleSpan.getText());
		}
		
		for(WebElement eleInput : inputSize) {
			System.out.println("Name of Input field: " + eleInput.getText());
		}
		
		for(WebElement ele : sizeOfLink) {
			System.out.println("Name of Links: " + ele.getText());
		}

	}

}
