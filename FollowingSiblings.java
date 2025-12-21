package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.prokabaddi.com/");
		
		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.xpath("(//p[text()='Telugu Titans'])[3]/../../../following-sibling::div[@class='table-data matches-lost']//p"));
		System.out.println(ele1.getText());
	}

}
