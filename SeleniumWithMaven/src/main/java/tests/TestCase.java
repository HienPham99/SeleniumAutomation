package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import common.TestBase;

public class TestCase {
	// biến global
	public TestBase testBase = new TestBase();
	
	@BeforeMethod
	@Parameters("browser")
	public void openWebsite(String browserName) {
		// call method from TestBase.java
		testBase.openWebWithSingeBrowser(browserName);
		//testBase.openWebsite("https://demoqa.com/");
	}
	
	@AfterMethod
	public void closeBrowser() {
		testBase.driver.quit();
	}

}
