package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.prokabaddi.com/");
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Bengaluru Bulls']/ancestor::ul[@class='quick-link-list']/descendant::a[text()='Gujarat Giants']"));
		System.out.println(ele1.getText());
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Bengaluru Bulls']/ancestor::ul[@class='quick-link-list']/descendant::a[text()='Haryana Steelers']"));
		System.out.println(ele2.getText());
		
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Bengaluru Bulls']/ancestor::ul[@class='quick-link-list']/descendant::a[text()='Jaipur Pink Panthers']"));
		System.out.println(ele3.getText());
		
		WebElement ele5 = driver.findElement(By.xpath("//p[text()='-48']/../preceding-sibling::div[@class='table-data matches-lost']//p[text()='10']"));
		System.out.println(ele5.getText());
		
		WebElement ele4 = driver.findElement(By.xpath("//p[text()='-48']/../preceding-sibling::div[@class='table-data team']//p[text()='Jaipur Pink Panthers']"));
        System.out.println(ele4.getText());
	}

}
