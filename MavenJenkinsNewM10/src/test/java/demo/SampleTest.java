package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest{
	@Test
	public void createSampleTest() throws InterruptedException {
		System.out.println("Sample created....");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
