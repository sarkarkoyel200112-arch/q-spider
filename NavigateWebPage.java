package day2Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebPage {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
   
     
        
        String actual_title = "Demo Web Shop";
        String expected_title = driver.getTitle();
        
        if(actual_title.equals(expected_title)) {
        	System.out.println("Test Case is passed");
        }
        else {
        	System.out.println("Test case is failed");
        }
        
        driver.navigate().to("https://chatgpt.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        driver.quit();
        
        
	}

}
