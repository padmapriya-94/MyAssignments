package home.secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
	Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		if (button.isEnabled()) {
			System.out.println("Button is Enabled");
		} else 
		{
System.out.println("Button is Disabled");
		}
		WebElement element = driver.findElement(By.xpath("(//button[@type='button'])[3]")); 
		Point location=element.getLocation();
		System.out.println("X coordinates:" +location.getX());
		System.out.println("Y coordinates:" +location.getY());
		WebElement element2 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		String colorValue=element2.getCssValue("color");
		System.out.println("color value:" +colorValue);
		WebElement element3 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		Dimension size=element3.getSize();
		System.out.println("width:" +size.getWidth());
		System.out.println("height:" +size.getHeight());
		driver.close();
		
		}

}
