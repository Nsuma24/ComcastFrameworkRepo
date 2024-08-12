package practice.hometest;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePagesampleTest {
	
	@Test
	public void homePageTest(Method mtd) {
		Reporter.log(mtd.getName() + "Test Start");
		
		//Soft Assert
		SoftAssert assertObj = new SoftAssert();
		
		Reporter.log("step-1", true);
		Reporter.log("step-2", true);
		assertObj.assertEquals("Home", "Home");
		Reporter.log("step-3", true);
		assertObj.assertEquals("Title", "Title");
		Reporter.log("step-4", true);
		assertObj.assertAll();
		Reporter.log(mtd.getName() + "Test End");

	}

	@Test
	public void verifyLogoHomePage(Method mtd) {
		Reporter.log(mtd.getName() + "Test Start");
		//Soft Assert
				SoftAssert assertObj = new SoftAssert();
				
				Reporter.log("step-1", true);
				Reporter.log("step-2", true);
				assertObj.assertTrue(true);
				Reporter.log("step-3", true);
				Reporter.log("step-4", true);
				assertObj.assertAll();
		
				Reporter.log(mtd.getName() + "Test End");

	}
}

