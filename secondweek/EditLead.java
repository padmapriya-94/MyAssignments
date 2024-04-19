package home.secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("padma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Getting training in the testleaf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("priyafsds@gmail.com");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select st=new Select(state);
		st.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Selenium Training");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
		
	}
	

}
