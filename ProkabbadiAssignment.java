package day7Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProkabbadiAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.prokabaddi.com/");
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Gujarat Giants']/../preceding-sibling::li[@class='quick-link']//a[text()='Dabang Delhi K.C.']"));
		System.out.println(ele1.getText());
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Gujarat Giants']/../preceding-sibling::li[@class='quick-link']//a[text()='Bengal Warriorz']"));
		System.out.println(ele2.getText());
		
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Gujarat Giants']/../preceding-sibling::li[@class='quick-link']//a[text()='Bengaluru Bulls']"));
		System.out.println(ele3.getText());

	}

}
