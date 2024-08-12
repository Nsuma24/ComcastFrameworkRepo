package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test2 {
	
	public class CreateContact_DP_Test {
		
		@Test(dataProvider = "getData")
		 
		public void createContacttest(String firstName, String lastName, long phoneNumber) {
			
			System.out.println("FirstName : "+ firstName + ", LastName:"+ lastName + ", phoneNumber:" + phoneNumber);	
		}
		
		@DataProvider
		public Object[][] getData() {
			
			Object[][] objArr = new Object[3][3]; // 3 --> number of times and 3--> number of arguements
			objArr[0][0] = "deepak";
			objArr[0][1] = "hr";
			objArr[0][2] = 8745632112l;
			
			objArr[1][0] = "sam";
			objArr[1][1] = "hd";
			objArr[1][2] = 9745632112l;
			
			objArr[2][0] = "Jhon";
			objArr[2][1] = "smith";
			objArr[2][2] = 7745632112l;

			return objArr;
		}
	}

}
