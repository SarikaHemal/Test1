package TestNGBasic;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void sum() {
		int a=3;
		int b=4;
		int c=a+b;
		System.out.println("sum of a and b" + c);
	}
}
