package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public void openWebBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\1Auto2023\\01Tools\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		String inputName = "hien";
		dr.get("https://demoqa.com/");
		dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		dr.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(inputName);

		dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("123a@gmail.com");

		
		//WebElement submitButton = dr.findElement(By.xpath("//*[@id=\\\"submit\\\"]"));
		// if (submitButton.isDisplayed()) {
		// Scroll to end of page
		//((JavascriptExecutor) dr).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		dr.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String actualName = dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		if (actualName.equals(inputName)) {
			System.out.println("Pass");
		}

	}

}
