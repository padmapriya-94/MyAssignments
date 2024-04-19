package home.secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebooRegisteration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		Thread.sleep(3000);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_5dbb']//input")).sendKeys("priya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("palmni@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //input[@name='reg_email_confirmation__']")).sendKeys("palmni@gmail.com");
		driver.findElement(By.xpath(" //input[@name='reg_passwd__']")).sendKeys("01257586");
		WebElement findElement = driver.findElement(By.xpath(" //select[@id='day']"));
		Select dd=new Select(findElement);
		dd.selectByVisibleText("11");
		WebElement findElement2 = driver.findElement(By.xpath(" //select[@id='month']"));
		Select dd1=new Select(findElement2);
		dd1.selectByVisibleText("Feb");
		WebElement findElement3 = driver.findElement(By.xpath(" //select[@id='year']"));
		Select dd2=new Select(findElement3);
		dd2.selectByVisibleText("2008");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

	
}


