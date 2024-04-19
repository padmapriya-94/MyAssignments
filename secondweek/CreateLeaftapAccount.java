package home.secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeaftapAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Rpriya94");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		WebElement fe = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dr=new Select(fe);
		dr.selectByVisibleText("Computer Software");
		Thread.sleep(2000);
		WebElement fe1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dr1=new Select(fe1);
		dr1.selectByVisibleText("S-Corporation");
		Thread.sleep(2000);
		WebElement fe2 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select dr2=new Select(fe2);
	    dr2.selectByValue("LEAD_EMPLOYEE");
	    Thread.sleep(2000);
	    WebElement fe3 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	    Select dr3=new Select(fe3);
	    dr3.selectByIndex(6);
	    Thread.sleep(2000);
	    WebElement fe4 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
	    Select dr4=new Select(fe4);
	    dr4.selectByValue("TX");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    driver.close();
	    
	}
}