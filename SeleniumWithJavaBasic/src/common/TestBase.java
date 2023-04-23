package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {

	public ChromeDriver dr;

	public void openWebBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\1Auto2023\\05Project\\03Git\\Seleniumautometion\\SeleniumWithJavaBasic\\src\\drivers\\chromedriver.exe");
		dr = new ChromeDriver();

		dr.get("https://demoqa.com/");
		dr.manage().window().maximize();

	}

	public String getCssValue(String string) {
		return null;
	}
	
	//***DatePicker truyền động

//	public void inputYear(String year) {
//		// tìm phần tử chứa dropdownbox
//		WebElement dropBox = dr.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//		Select years = new Select(dropBox);
//		years.selectByValue(year);
//	}
//
//	public void inputMonth(String month) {
//		// tìm phần tử chứa dropdownbox
//		WebElement dropBox = dr.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//		Select months = new Select(dropBox);
//		months.selectByValue(month);
//
//	}
//	public void inputMonthDay(String day) {
//	// tìm danh sách các day đang hiển thị
//	 List<WebElement> visibleDays= dr.findElements(By.xpath("//div[not(contains(@class,'outside-month'))and@role='option']"));
//			 //Dùng Foreach duyệt qua từng phần tử trong list
//	 for (WebElement e : visibleDays)
//	 {
//		 e.click();
//	 }

//}
}
