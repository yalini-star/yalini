package TestNg;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example2 {
	
	@Test(dataProvider="dp")
	public void test(Integer n,String s) {
		System.out.println("In:"+n+"and s"+s);
	}

	@DataProvider
	public Object[][] dp(){
		return new Object[][] {
			new Object[]{1,"a"},new Object[] {2,"b"}};
		}
		
	}



