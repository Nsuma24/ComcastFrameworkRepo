package practice.test;

import org.testng.annotations.DataProvider;

public class B {
	@DataProvider
	public Object[][] getData(){
		Object [][] objArr = new Object[2][2];
		objArr[0][0] = "Same";
		objArr[0][1] = 9874563212l;
		objArr[1][0] = "Golu";
		objArr[1][1] = 9585863241l;
		return objArr;
	}

}

