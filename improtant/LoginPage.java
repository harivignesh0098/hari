package improtant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getCurrentUrl();
		
		String title2="http://leaftaps.com/opentaps/control/login";
		if (title .contains(title2)) 
		{
			System.out.println("Successfully");
		}else
		{
			System.out.println("Nota");
		}
		String text = driver.getTitle();
		System.out.println(text);
		String text2="Leaftaps - TestLeaf Automation Platform";
		
		if (text .equals(text2)) 
		{
			System.out.println("Title Successfully");
		}else
		{
			System.out.println("Title not Successfully");
		}
		driver.close();
	}
                                               
}
