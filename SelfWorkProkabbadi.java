package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkProkabbadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.prokabaddi.com/");
		
		WebElement p = driver.findElement(By.xpath("(//p[text()='Bengaluru Bulls']/parent::div/parent::div/parent::div/parent::div//p[@class='count'])[1]"));
		System.out.println("Score of p points: "+p.getText());
		
		WebElement w = driver.findElement(By.xpath("(//p[text()='Bengaluru Bulls']/parent::div/parent::div/parent::div/parent::div//p[@class='count'])[2]"));
		System.out.println("Score of w points: "+w.getText());
		
		WebElement l = driver.findElement(By.xpath("(//p[text()='Bengaluru Bulls']/parent::div/parent::div/parent::div/parent::div//p[@class='count'])[3]"));
		System.out.println("Score of l points: "+l.getText());
		
		WebElement score_diff = driver.findElement(By.xpath("(//p[text()='Bengaluru Bulls']/parent::div/parent::div/parent::div/parent::div//p[@class='count'])[4]"));
        System.out.println("Score of score_difference: "+score_diff.getText());		
        
		WebElement pts = driver.findElement(By.xpath("(//p[text()='Bengaluru Bulls']/parent::div/parent::div/parent::div/parent::div//p[@class='count'])[5]"));
		System.out.println("Score of final points: "+pts.getText());
		
		
		

	}

}
