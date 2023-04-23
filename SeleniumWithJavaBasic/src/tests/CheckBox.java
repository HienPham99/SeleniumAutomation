package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestBase;

public class CheckBox {

	// TC1
	public void TC1() {
		TestBase testBase = new TestBase();
		testBase.openWebBrowser();

		testBase.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")).click();// click
																											// element
		testBase.dr.findElement(By.xpath("//span[normalize-space()='Check Box']")).click(); // click checkbox
		boolean iselectCheckBox = testBase.dr.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"))
				.isSelected();// kiểm ta checkbox đã dduocj check chưa
		System.out.println(iselectCheckBox);
		if (iselectCheckBox == false) {
			testBase.dr.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();// Nếu checkbox
																										// chưa đc tích
																										// thì tích
																										// checkbox

		}

		String tittleName = testBase.dr.findElement(By.xpath("//div[@id='result']")).getText().replace("\n", " "); // gettext title
		System.out.println(tittleName);

		testBase.dr.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click(); //click vào icon ">"
		Boolean isSelected = testBase.dr.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']/input"))
				.isSelected();//all checkboxes are display and checked
	
		if (isSelected == true) {
		System.out.println(isSelected);
		}

	}

}
