import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        String handle= driver.getWindowHandle();
        System.out.println(handle);
        driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) {
        	System.out.println(handle1);
        	driver.switchTo().window(handle1);
      	}
       // driver.close();
        driver.quit();
	}
}
