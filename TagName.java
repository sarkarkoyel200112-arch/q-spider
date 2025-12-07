package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        
       List<WebElement> numberOfLinks =  driver.findElements(By.tagName("a"));
       System.out.println("Number of Links: " + numberOfLinks.size());
       
       for(WebElement ele : numberOfLinks) {
    	   System.out.println(ele.getText());
       }
	}

}
