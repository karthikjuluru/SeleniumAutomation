package selenium;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGProgram1 {
	@Test(priority = 1, groups = { "Sanity" }, enabled=false)
	public void f() {
		System.out.println("Test Method1");
	}

	@Test(priority = 0, groups = { "Regression",
			"Sanity" }, expectedExceptions = ArithmeticException.class, enabled = false)
	public void f1() {
		System.out.println("Test Method2");
		int b = 8 / 0;
	}

	@BeforeMethod
	public void beforeMethod(ITestContext tc) {
		System.out.println("Before Method");
		String browserName = tc.getCurrentXmlTest().getParameter("browser");
		System.out.println(browserName);

	}

	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true } };
	}

	@Test(dataProvider = "test1", priority=2)
	public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
		System.out.println(inputNumber + " " + expectedResult);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

}
