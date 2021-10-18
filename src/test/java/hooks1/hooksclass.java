package hooks1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksclass {

	public static WebDriver driver;
	
	@Before
	public void initialisation() {
		System.setProperty("webdriver.chrome.driver", "D:\\capgemini\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://retailm1.upskills.in/admin/");
		driver.manage().window().maximize();
	}
	
	@After
	public void close() {
	driver.quit();
	}
}
