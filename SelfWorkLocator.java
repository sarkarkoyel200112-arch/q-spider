package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        
        driver.findElement(By.id("FirstName")).sendKeys("Koyel");
        
        driver.findElement(By.id("LastName")).sendKeys("Sarkar");
        
        driver.findElement(By.id("Email")).sendKeys("koyels586@gmail.com");
        
        driver.findElement(By.id("Password")).sendKeys("Ks_5oy");
        
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Ks_5oy");
        
        driver.findElement(By.id("register-button")).click();
     }

}
