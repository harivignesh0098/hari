package improtant;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']")).click();
		WebElement Search = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(Search);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) 
		{
			if(i==4 || i==8) 
			{
				String text = options.get(i).getText();
				System.out.println(text);
			}
				
		}
		
	}

}
