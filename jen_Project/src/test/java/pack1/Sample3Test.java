package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample3Test {

	@Test
	public void a1() {
		WebDriver driver=null;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}else if (BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}else
			driver = new EdgeDriver();
		
		driver.get(URL);
	}
}
