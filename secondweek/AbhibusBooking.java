package home.secondweek;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhibusBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-id='6 Chennai (Tamil Nadu)']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-id='7 Bangalore (Karnataka)']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='container  ']//h5")).getText();
		System.out.println(text2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='text-grey']/small]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='row ']/button")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='seat sleeper']/*[name()='svg']//*[local-name()='rect'and@height='29'and@fill='white']")).click();
		driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='container checkbox-container  md '])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='container checkbox-container  md '])[1]")).click();
		WebElement sb=(driver.findElement(By.xpath("//span[@class='text-primary']")));
		String seat=sb.getText();
		System.out.println(seat);
		WebElement fare=(driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")));
		String price=fare.getText();
		System.out.println(price);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
		

	}

}
