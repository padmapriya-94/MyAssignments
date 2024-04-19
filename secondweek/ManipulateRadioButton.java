package home.secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManipulateRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Chennai']"));
		radioButton.click();
		Thread.sleep(3000);
		radioButton.click();
		if (!radioButton.isSelected()) {
			System.out.println("Radio Button is not Selected");
		} else {
			System.out.println("Radio Button is selected");

		}
		WebElement checkdefault = driver.findElement(By.xpath("(//input[@checked='checked'])[4]"));
		String txt=checkdefault.getText();
		System.out.println("default selected radion button: " +txt);
		WebElement age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if(age.isEnabled())
		{
			System.out.println("Button is clicked");
		}
		else
		{
			age.click();
			System.out.println("button is now clicked");
		}
		driver.close();
	}
}
