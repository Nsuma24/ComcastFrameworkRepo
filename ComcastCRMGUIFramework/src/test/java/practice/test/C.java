package practice.test;

import org.testng.annotations.Test;

public class C  {
	

	/**@Test(dataProvider = "getData")
	public void getDataFromDataProvider(String FirstName, long Number) {
		//System.out.println("FirstName"+FirstName+"Number"+Number);
		System.out.println(FirstName);
		System.out.println(Number);
	}**/
	
	@Test(dataProviderClass = B.class, dataProvider = "getData")
	public void receive(String FirstName, long Number) {
		System.out.println(FirstName);
		System.out.println(Number);
	}
	

}
