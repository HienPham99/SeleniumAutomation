package tests;

import java.security.Key;
import java.sql.Driver;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import common.TestBase;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PractiveForm {
		
	public void TC1() throws Exception {
		TestBase testBase = new TestBase();
		testBase.openWebBrowser();
		String firstName = "Hien";
		String lastName = "Pham";
		String emailAddress = "hien99@gmail.com";
		// String datePicker = "20/04/2023";
		String phone = "0123456789";
		String addressCurrent = "Đông Anh, Hà Nội";
		String inputSubject=" ";
		String inputState = " ";
		String inputCity = " ";
		

		testBase.dr.findElement(By.xpath("//div[@class='home-body']//div[2]//div[1]//div[1]")).click();
		testBase.dr.findElement(By.xpath("//span[normalize-space()='Practice Form']")).click();
		testBase.dr.findElement(By.id("firstName")).sendKeys(firstName);
		testBase.dr.findElement(By.id("lastName")).sendKeys(lastName);
		testBase.dr.findElement(By.id("userEmail")).sendKeys(emailAddress);
		Boolean radioFemale = testBase.dr.findElement(By.xpath("//label[normalize-space()='Female']")).isSelected();
		System.out.println("Trang thai radioF: " + radioFemale);
		if (radioFemale == false) {
			testBase.dr.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		}
		testBase.dr.findElement(By.id("userNumber")).sendKeys(phone);
		
		//Scoll đến vị trí cần hiển thị
		//((JavascriptExecutor) testBase.dr).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Handle DatePicker field***
		
		testBase.dr.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();// click vào trường Date of Birth để xổ ra form datepicker
			
		//Handle với dropdown là years

		WebElement selectYears = testBase.dr.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select select = new Select(selectYears);
		
		select.selectByVisibleText("1990");
		
		//Handle với dropdown là month	

		WebElement selectMonths = testBase.dr
				.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select thangs = new Select(selectMonths);
		thangs.selectByVisibleText("August");
		
		//Handle với dropdown là day
		testBase.dr.findElement(By.xpath("//div[@aria-label='Choose Wednesday, August 8th, 1990']")).click();	
		
		//Handle với subject field	
		
		testBase.dr.findElement(By.xpath("//div[@id='subjectsContainer']")).click();
		testBase.dr.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("E");
		List<WebElement> listItems = testBase.dr.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		inputSubject = listItems.get(0).getText();
		listItems.get(0).click();
				
		//Handle với all checkbox Hobbies
		
		Boolean checkboxGender = testBase.dr
				.findElement(By.xpath("//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']")).isSelected();
		System.out.println("Status của Gender là: " + checkboxGender);
		if (checkboxGender == false) {
			testBase.dr.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
			testBase.dr.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
		}
		
		//C1:Zoom in/out screen thành 80%
		JavascriptExecutor js = (JavascriptExecutor) testBase.dr;	
//		js.executeScript("arguments[0].scrollIntoView(true);", testBase.dr.findElement(By.id("submit")));//scoll xuống element cần hiển thị
		js.executeScript("document.body.style.zoom = '0.8'"); //C1:Zoom in/out screen thành 80%	
		
		//C2 zoom screen = 70%
		//((IJavaScriptExecutor) Browser.Driver).ExecuteScript("document.body.style.zoom = '70%';");//C2 zoom screen = 70%
		
						
		//Handle với Current Address 

		testBase.dr.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(addressCurrent);			
		Thread.sleep(2000);	
		
			//Handle với State and city			
				
		testBase.dr.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		List<WebElement> listState = testBase.dr.findElements(By.xpath("//div[contains(text(),'NCR')]"));
		inputState = listState.get(0).getText();
		listItems.get(0).click();
		
		testBase.dr.findElement(By.xpath("//div[@id='city']")).click();
		
		List<WebElement> listCity = testBase.dr.findElements(By.xpath("//div[contains(text(),'Delhi')]"));
		inputCity = listCity.get(0).getText();
		listItems.get(0).click();
			
		
		testBase.dr.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("Submit successfully");

	}
	
	public void TC2() {
//		int chromeDriver;
//		//System.setProperty("webdriver.chrome.driver", /pathTo/chromeDriver);
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("chrome://settings/");
//		driver.executeScript("chrome.settingsPrivate.setDefaultZoom(1.5);");
//		driver.get("https://demoqa.com/");
		TestBase testBase = new TestBase();
		testBase.openWebBrowser();
		testBase.dr.findElement(By.xpath("//div[@class='home-body']//div[2]//div[1]//div[1]")).click();
		testBase.dr.findElement(By.xpath("//span[normalize-space()='Practice Form']")).click();
		
		testBase.dr.findElement(By.xpath("//button[@id='submit']")).click();
		
		//Submit fail. All borders are red
		System.out.println("@" + testBase.getCssValue("red border" + "'"));
	}

}
