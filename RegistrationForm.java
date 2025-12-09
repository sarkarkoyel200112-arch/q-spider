package day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys("Koyel");
		
		driver.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("Sarkar");
		
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("A-32/201, Glory Tower, Treasure Fantasy, Rau-Rangwasa");
		
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("koyels586@gmail.com");
		
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("7000592671");
		
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		
		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		
		driver.findElement(By.cssSelector("input[value='Movies']")).click();
		
		
		
		driver.findElement(By.cssSelector("select[id='countries']")).sendKeys("Select Country");
		
		
		
		
		
		driver.findElement(By.cssSelector("button[id='submitbtn']")).click();
	}

}
