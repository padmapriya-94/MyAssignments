package home.secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractionWithCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		Thread.sleep(2000);
		WebElement fe1 = driver.findElement(By.xpath("//label[text()='Java']"));
		WebElement fe2 = driver.findElement(By.xpath("//label[text()='Python']"));
		WebElement fe3 = driver.findElement(By.xpath("//label[text()='Javascript']"));
		fe1.click();
		Thread.sleep(2000);
		fe2.click();
		Thread.sleep(2000);
		fe3.click();
		Thread.sleep(3000);
		WebElement state =driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		state.click();
		Thread.sleep(2000);
		String text= driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		System.out.println("First click State is:" +text);
		Thread.sleep(2000);
		state.click();
		String text1= driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
		System.out.println("Second click State is:" +text1);
		Thread.sleep(2000);
		WebElement toggle=driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggle.click();
		String text3= driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println("Status of Toggle:" +text3);
		Thread.sleep(2000);
		WebElement box=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		box.click();
		if(box.isSelected()) {
			System.out.println("Toggle is enabled");
		}else {
			System.out.println("Toggle is disabled");
		}
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[@data-item-value='Miami']//div[contains(@class,'ui-state-default')]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Miami']")).click();
		driver.close();
	}
}


