package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Point p = new Point(10, 500);
		//driver.manage().window().setPosition(p);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.partialLinkText("Link T"));
		System.out.println(ele.getText());
		ele.click();
	}

}
