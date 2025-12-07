package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?");
		
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Koyel");
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Sarkar");
		driver.findElement(By.className("_8esa")).isSelected();
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("sarkarkoyel380@gmail.com");
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Ks_6arkaroyel");
		driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();

	}

}
