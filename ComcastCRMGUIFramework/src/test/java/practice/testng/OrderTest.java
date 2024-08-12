package practice.testng;

import org.testng.annotations.Test;

public class OrderTest {
	
	@Test(invocationCount = 10)
	public void createOrder() {
		System.out.println("Execute createOrderTest ===>123");
		
	}
    
	@Test(enabled = false)
	public void billingAnOrder() {
		System.out.println("Execute billingAnOrder ===>123");
	}
}
