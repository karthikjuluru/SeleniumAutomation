import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {
	static WebDriver driver;
	public static void main(String[] args) {
		// Configuring the Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");

		// Creating the Instance of the driver
		driver = new FirefoxDriver();
		
		//launching the website
		driver.get("http://www.google.com");
		driver.close();
	}
}
