package improtant;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TeafGroupDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement selectTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(selectTool);
		select.selectByIndex(3);
		
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) 
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//select[@id='j_idt87:country_input']"));
		Select select1=new Select(findElement);
		select1.selectByValue("India");
	}

}
