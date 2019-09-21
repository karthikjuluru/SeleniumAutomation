import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SampleTest2 {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.co.in/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	  public void test1() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys("seleniumhq");
	    driver.findElement(By.name("btnG")).click();
	    driver.findElement(By.linkText("Downloads - Selenium")).click();
	    assertEquals(driver.findElement(By.xpath("//div[@id='header']/h1/a")).getText(), "Browser Automation");
	    driver.findElement(By.xpath("//div[@id='header']/h1/a")).click();
	  }

	@AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	  }

}
