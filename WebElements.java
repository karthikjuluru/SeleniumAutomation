import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement element = driver.findElement(By.name("firstname"));
		element.sendKeys("karthik");
		Thread.sleep(2000);
		element.clear();
		element = driver.findElement(By.linkText("Link Test"));
		element.click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(5000);
		element = driver.findElement(By.partialLinkText("Partial"));
		element.click();
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.name("firstname")).isDisplayed();
		System.out.println("Label is displaying: "+flag);
		flag = driver.findElement(By.name("firstname")).isEnabled();
		System.out.println("Label is Enabled: "+flag);
		flag = driver.findElement(By.id("sex-0")).isSelected();
		System.out.println("Radio button is selected:"+flag);
		driver.findElement(By.id("sex-0")).click();
		flag = driver.findElement(By.id("sex-0")).isSelected();
		System.out.println("Radio button is selected:"+flag);
		String text = driver.findElement(By.partialLinkText("Partial")).getText();
		System.out.println("Link text:"+text);
		String tagName = driver.findElement(By.name("firstname")).getTagName();
		System.out.println("TagName:"+tagName);
		String attrName = driver.findElement(By.name("firstname")).getAttribute("type");
		System.out.println("AttributeName:"+attrName);
		Point p = driver.findElement(By.name("firstname")).getLocation();
		System.out.println("Location -- x:"+p.getX()+" y:"+p.getY());
		Dimension d = driver.findElement(By.name("firstname")).getSize();
		System.out.println("Size -- width:"+d.getWidth()+" height:"+d.getHeight());
		driver.quit();
	}
}
