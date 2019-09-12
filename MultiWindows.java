package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.className("txtSign")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> s = driver.getWindowHandles();
		for(String temp:s) {
			if(!temp.equalsIgnoreCase(driver.getWindowHandle())) {
				driver.switchTo().window(temp);
			}
		}
		driver.switchTo().defaultContent();
		System.out.println(s);
		driver.close();
	}

}
