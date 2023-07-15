package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample2Test {
	@Test
	public  void m2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//push
	}
}
