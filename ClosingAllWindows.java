import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingAllWindows {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Configuring the Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		
		//Creating the Instance of the driver
		driver = new FirefoxDriver();
		
		//Launching the website
		driver.get("https://www.online.citibank.co.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//span[text()='Login']")).click();
		Thread.sleep(4000);
		
		//driver.close();
		driver.quit();
	}

}
