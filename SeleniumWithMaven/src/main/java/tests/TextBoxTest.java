package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest extends TestCase {
	// TC1-submitSuccessfully
	@Test(description = "TC1 - submit Successfully", dataProvider = "InputData", groups = "Smoke Test")
	public void submitSuccessfully(String inputFullName, String inputEmailName, String inputCurrentAddress, String inputPermanentAddress) {
//		String inputFullName = "Hien";
//		String inputEmailName = "hien@gmail.com";
//		String inputCurrentAddress = "Đông Anh";
//		String inputPermanentAddress = "Hà nội - Việt Nam";
//	
		//openWebsite();
		HomePage homePage = new HomePage(testBase.driver);
		
		ElementsPage elementsPage = homePage.clickOnElementsMenu();
		TextBoxPage textBoxPage = elementsPage.clickOnTextBoxMenu();
	
		textBoxPage.testBase.inputText(testBase.driver, inputFullName,textBoxPage.locFullName );
		textBoxPage.testBase.inputText(testBase.driver, inputEmailName, textBoxPage.locEmailName);
		textBoxPage.testBase.inputText(testBase.driver, inputCurrentAddress, textBoxPage.locCurrentAddress);
		textBoxPage.testBase.inputText(testBase.driver, inputPermanentAddress, textBoxPage.locPermanentAddress);
		
		textBoxPage.testBase.click(testBase.driver, textBoxPage.locSubmit);
		
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locName_Displayed),inputFullName);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locEmail_Displayed),inputEmailName);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locCurrentAddress_Displayed),inputCurrentAddress);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locPermanentAddress_Displayed),inputPermanentAddress);

	}
	@Test
	public void test2() {}
	
	@Test
	public void test3() {}

//	// TC2-Email format is wrong
//	@Test(description = "TC2 - Email format is wrong")
//	public void emailFormatIsWrong() {
//		HomePage homePage = new HomePage(testBase.dr);
//		ElementsPage elementsPage = homePage.clickOnElementsMenu();
//		TextBoxPage textBoxPage = elementsPage.clickOnTextBoxMenu();
////		textBoxPage.inputUserName("Hien");
////		textBoxPage.inputUserEmail("@");
////		textBoxPage.inputCurrentAddress("Đông Anh");
////		textBoxPage.inputPermanentAddress("Hà nội - Việt Nam");
////		textBoxPage.clickSubmitBtn();
//
//	}

}
