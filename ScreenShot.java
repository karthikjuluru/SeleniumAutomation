import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	public WebDriver driver;

	@Test
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		try {
			driver.findElement(By.id("testing")).sendKeys("test");
		} catch (Exception e) {
			System.out.println("I'm in exception");
			getscreenshot();
		}
	}

	public void getscreenshot() throws Exception {
		String path;
		try{
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			path = "D:\\" + scrFile.getName();
			FileUtils.copyFile(scrFile, new File(path));
		}catch(IOException e) {
	        System.out.println("Failed to capture screenshot: " + e.getMessage());
	    }
	}
}