package improtant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderingMobile 
{

	public static void main(String[] args) throws InterruptedException 
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
	    driver.findElement(By.xpath("//a[@id='allApps_tab']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("filter")).sendKeys("Service Catlog");
	    driver.findElement(By.xpath("//div[text()='Service Catalog']")).click();
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//table[@class='no_underline_table'])[2]")).click();
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(0);
	    
	    WebElement findElement = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	    Select color = new Select(findElement);
	    color.selectByIndex(2);
	    
	    WebElement findElement2 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
	    Select ram = new Select(findElement2);
	    ram.selectByIndex(2);
	    driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	    
	    WebElement print = driver.findElement(By.id("requesturl"));
	    String text = print.getText();
	    System.out.println("Request Number:"+text);
	    
	    WebElement print1 = driver.findElement(By.xpath("(//dl[@class='dl-horizontal sc-dl-horizontal'])//dd"));
	    String text2 = print1.getText();
	    System.out.println("Order Placed:"+text2);
	}
}
