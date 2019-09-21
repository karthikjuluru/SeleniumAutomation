import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		List<WebElement> oRadioButton = driver.findElements(By.name("sex"));
		boolean bValue = false; 
		bValue = oRadioButton.get(0).isSelected(); 
		if (bValue = true) { 
			oRadioButton.get(1).click(); 
		} else {
		  	oRadioButton.get(0).click(); 
		}
		driver.quit();
	}
}
