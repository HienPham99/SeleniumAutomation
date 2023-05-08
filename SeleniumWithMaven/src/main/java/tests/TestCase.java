package tests;

import common.TestBase;

public class TestCase {
	// biến global
	public TestBase testBase = new TestBase();

	public void openWebsite() {
		// call method from TestBase.java
		testBase.openWebWithSingeBrowser("chrome");
		//testBase.openWebsite("https://demoqa.com/");

	}
	public void closeBrowser() {
		testBase.driver.close();
	}

}
