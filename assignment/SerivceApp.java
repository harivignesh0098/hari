package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SerivceApp
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev117051.service-now.com");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//label[@class='control-label']/following::input)[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("V9yJV=jz3Q^i");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//div[@class='input-group ref-container']//following::button")).click();
		
		Set<String> next = driver.getWindowHandles();
		List<String> next1 = new ArrayList<String>(next);
		
		driver.switchTo().window(next1.get(1));
		driver.findElement(By.linkText("Abel Tuter")).click();
		driver.switchTo().window(next1.get(0));
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("(//div[@class='col-xs-2 col-md-1_5 col-lg-2 form-field-addons']//following::a)[1]")).click();
	}

}
