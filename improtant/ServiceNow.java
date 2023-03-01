package improtant;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
	    driver.findElement(By.id("user_name")).sendKeys("admin");
	    driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
	    driver.findElement(By.id("sysverb_login")).click();
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.id("filter")).sendKeys("Service Category");
	    driver.findElement(By.xpath("//div[text()='Service Category']")).click();
	   
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//button[@class='btn btn-default'])[3]")).click();
	    driver.switchTo().defaultContent();
	   
	    Set<String> next = driver.getWindowHandles();
		List<String> next1 = new ArrayList<String>(next);
		
		driver.switchTo().window(next1.get(1));
	    driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
	    driver.switchTo().window(next1.get(0));
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//button[@class='btn btn-default'])[4]")).click();
	    driver.switchTo().defaultContent();
	    
	    Set<String> new1 = driver.getWindowHandles();
		List<String> next2 = new ArrayList<String>(new1);
		
		driver.switchTo().window(next2.get(1));
		driver.findElement(By.xpath("//a[text()='Technical Catalog']")).click();
		driver.switchTo().window(next2.get(0));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		driver.switchTo().defaultContent();
	}
}
