package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void createDemoTest() throws InterruptedException {
		System.out.println("Demo created....");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
