package improtant;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon {

	public static void main(String[] args) throws IOException {

       ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9pro",Keys.ENTER);

        WebElement pricefirst = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));

        String price1 = pricefirst.getText().replaceAll("[^0-9]", "");

        System.out.println(price1);

        WebElement rat= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-micro'])[1]"));

        String ratingtext = rat.getText();

        System.out.println(ratingtext);

        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();

        Set<String> handles = driver.getWindowHandles();

        List<String> bj =new ArrayList<String>(handles);

        driver.switchTo().window(bj.get(1));

        File screenshotAs = driver.getScreenshotAs(OutputType.FILE);

        File des =new File("./snap/img.png");

        FileHandler.copy(screenshotAs, des);


        driver.findElement(By.id("add-to-cart-button")).click();

        String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();

        String price2 = text.replaceAll("[^0-9]", "");

        if(price1.equals(price2))
        {
        	System.out.println("correct price");
        }
        else
        {
        	System.out.println("not correct price");
        }
	}

}