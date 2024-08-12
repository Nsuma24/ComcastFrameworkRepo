package practice.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	@Test(dataProvider = "getData")
	public void getDataFromDataProvider(String FirstName, long Number) {
		System.out.println("FirstName"+FirstName+"Number"+Number);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object [][] objArr = new Object[2][2];
		objArr[0][0] = "Same";
		objArr[0][1] = "9874563212";
		objArr[1][0] = "Golu";
		objArr[1][1] = "9585863241";
		return objArr;
	}

}
