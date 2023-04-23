package tests;

import org.openqa.selenium.By;

import common.TestBase;

public class TextBoxTest {
	// TC1
	public void testTC1() {
		TestBase testBase = new TestBase();
		testBase.openWebBrowser();
		String inputName = "hien";

		testBase.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(inputName);

		testBase.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("123a@gmail.com");

		// WebElement submitButton =
		// dr.findElement(By.xpath("//*[@id=\\\"submit\\\"]"));
		// Scroll to end of page
		// ((JavascriptExecutor)dr).executeScript("window.scrollTo(0,
		// document.body.scrollHeight)");

		testBase.dr.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String actualName = testBase.dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();

		System.out.println(actualName);

		if (actualName.equals(inputName)) {

			System.out.println("Pass");
		}

	}

	// TC2
	public void testTC2() {
		TestBase testBase = new TestBase();
		testBase.openWebBrowser();

		String inputName = "hien";

		testBase.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(inputName);

		testBase.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("@");

		// WebElement submitButton =
		// dr.findElement(By.xpath("//*[@id=\\\"submit\\\"]"));
		// Scroll to end of page
		// ((JavascriptExecutor)dr).executeScript("window.scrollTo(0,
		// document.body.scrollHeight)");

		testBase.dr.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		System.out.println("@" + testBase.getCssValue("red border" + "'"));
	}
}
