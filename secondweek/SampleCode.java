package home.secondweek;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
