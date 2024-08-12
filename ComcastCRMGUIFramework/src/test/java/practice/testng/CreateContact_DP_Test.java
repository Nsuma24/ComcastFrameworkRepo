package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test {
	
	@Test(dataProvider = "getData")
	 
	public void createContacttest(String firstName, String lastName) {
		
		System.out.println("FirstName : "+ firstName + ", LastName:"+ lastName);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] objArr = new Object[3][2]; // 3 --> number of times and 2--> number of arguements
		objArr[0][0] = "deepak";
		objArr[0][1] = "hr";
		
		objArr[1][0] = "sam";
		objArr[1][1] = "hd";
		
		objArr[2][0] = "Jhon";
		objArr[2][1] = "smith";

		return objArr;
	}

}
