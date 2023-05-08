//package tests;
//
//import org.testng.annotations.Test;
//
//import common.TestBase;
//import pages.FormPage;
//import pages.HomePage;
//import pages.PracticeFormPage;
//
//public class PracticeFormTest extends TestCase {
//	TestBase testBase = new TestBase();
//	public void openWebsite() {
//		testBase.openWebsite("https://demoqa.com/");
//		
//	}
//	
//	@Test(description = "TC1-Submit successfully")
//	public void submitSuccessfully() {
//		HomePage homePage = new HomePage(testBase.dr);
//		FormPage formPage= homePage.clickOnFormsMenu();
//		PracticeFormPage praticeFormPage = formPage.clickOnPraticeFormMenu();
//		praticeFormPage.zoomScreen();	
//		praticeFormPage.inputFirstName("Hien");
//		praticeFormPage.inputLastName("Pham Thi");
//		praticeFormPage.inputEmail("hien@gmail.com");
//		praticeFormPage.inputGender("Male");
//		praticeFormPage.inputMobile("0987654321");
//		praticeFormPage.inputDateOfBirthYear("1990");
//		praticeFormPage.inputDateOfBirthMorth("October");
//		praticeFormPage.inputDateOfBirthDay();
//		praticeFormPage.inputSubject("E");
//		praticeFormPage.selectHobbies();
//		praticeFormPage.inputCurrentAddress("Đông anh- Hà Nội");
//		praticeFormPage.selectState("NCR");
//		praticeFormPage.selectCity("Delhi");
//		praticeFormPage.clickSubmit();
//				
//		
//	}
//	
//
//}
