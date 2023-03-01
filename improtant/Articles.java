package improtant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Articles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140572.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
	    driver.findElement(By.id("user_name")).sendKeys("admin");
	    driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
	    driver.findElement(By.id("sysverb_login")).click();
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("filter")).sendKeys("Articals");
	    driver.findElement(By.xpath("//span[text()='Articles']")).click();
	  
	    
	    
	    
	}

}
