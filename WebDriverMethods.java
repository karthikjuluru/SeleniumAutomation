package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		Point p = new Point(10, 500);
		driver.manage().window().setPosition(p);
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource().length());
		
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(5000);
		driver.quit();
	}

}
