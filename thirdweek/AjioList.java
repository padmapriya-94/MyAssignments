package home.thirdweek;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
	    driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
	    driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
	    Thread.sleep(2000);
	    String text=driver.findElement(By.xpath("//div[@class='length']")).getText();
	    System.out.println("The total bags found is:" +text);
		List<WebElement> brand= driver.findElements(By.xpath("//div[@class='brand']/strong"));
		List<String> brandName1=new ArrayList<String>();
		for(int i=0;i<brand.size();i++)
		{
			String brandName=brand.get(i).getText();
			brandName1.add(brandName);
			
		}
		System.out.println(brandName1);
		List<WebElement> bag= driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0;i<bag.size();i++)
		{
			String bagName=bag.get(i).getText();
			System.out.println(bagName);
		}
		
	   // List<WebElement> brand= driver.findElements(By.xpath("//div[text()='A']/following::span[@class='facet-list-title-name']"));

	}

}
