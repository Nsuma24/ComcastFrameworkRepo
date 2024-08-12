package practice.testng;
/**
 * 
 * test class for contact module
 * @author Suma
 * 
 */

import org.testng.annotations.Test;

import com.comcast.crm.basetest.Base;
import com.comcast.crm.objectrepositoryutility.LoginPage;

public class SearchContactTest extends Base{
	/**
	 * Scenario : login()====> navigateContact===> createcontact()===verify
	 */
	
	@Test
	public void searchContactTest() {
		/*step1 : logion to app*/
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp("url", "username", "password");
	}
	
	

}
