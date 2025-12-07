package day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentLocators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");
        
        driver.findElement(By.name("firstname")).sendKeys("Koyel");
        driver.findElement(By.name("lastname")).sendKeys("Sarkar");
        driver.findElement(By.name("reg_email__")).sendKeys("koyels229@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ks_5arkaroyel");
        
        driver.findElement(By.name("websubmit")).click();
        
        driver.findElement(By.linkText("Already have an account?")).click();
        
        driver.findElement(By.name("email")).sendKeys("koyels229@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Ks_5arkaroyel");
        
        driver.findElement(By.name("login")).click();
    }
}
