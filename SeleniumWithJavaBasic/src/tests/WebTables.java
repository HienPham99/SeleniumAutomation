package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import common.TestBase;

public class WebTables {
	public static void TC1() throws Exception {
		TestBase tb= new TestBase();
		tb.openWebBrowser();
		String firstName = "Hien";
		String lastName = "Pham";
		String emailAddress= "hien99@gmail.com";
		String age = "25";
		String sal = "20000";
		String dep="QA";
		tb.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		tb.dr.findElement(By.xpath("//span[normalize-space()='Web Tables']")).click();
//		tb.dr.findElement(By.xpath("//input[@id='searchBox']")).click();
//		tb.dr.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("a");
		tb.dr.findElement(By.id("addNewRecordButton")).click();
		tb.dr.findElement(By.id("firstName")).sendKeys(firstName);
		tb.dr.findElement(By.id("lastName")).sendKeys(lastName);
		tb.dr.findElement(By.id("userEmail")).sendKeys(emailAddress);
		tb.dr.findElement(By.id("age")).sendKeys(age);
		tb.dr.findElement(By.id("salary")).sendKeys(sal);
		tb.dr.findElement(By.id("department")).sendKeys(dep);
		
		Thread.sleep(1000);
		
		tb.dr.findElement(By.id("submit")).click();
		
		System.out.println("Create acc successfully/New acc is added.");
		
	}
	
	public static void TC2() {
		TestBase tb = new TestBase();
		tb.openWebBrowser();
		tb.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		tb.dr.findElement(By.xpath("//span[normalize-space()='Web Tables']")).click();
		tb.dr.findElement(By.id("searchBox")).click();
		tb.dr.findElement(By.id("searchBox")).sendKeys("Alden",Keys.ENTER);
		
		//Check kết quả search theo keyword
		
		//String resultSearch =tb.dr.findElement(By.xpath("//div[@class='rt-tr -odd']")).getText().replace("\n", " ").trim(); //lấy hết thông tin của account.
		String resultSearch =tb.dr.findElement(By.xpath("//div[normalize-space()='Alden']")).getText();// Lấy theo keyword theo cột firstName của account
		
		System.out.println("Result search is: "+"\n " +  resultSearch);
		
		
		
		
	}
	
	

}
