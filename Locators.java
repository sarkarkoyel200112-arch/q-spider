package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Computer");
		
		driver.findElement(By.name("Email")).sendKeys("koyels586@gmail.com");
		
		driver.findElement(By.linkText("Shopping cart")).click();
		
		driver.findElement(By.partialLinkText("Wish")).click();
	}

}
