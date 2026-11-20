package Demo;

import org.testng.annotations.Test;

public class DenoTest {
	
	@Test(groups = "smoke")
	public void addTest()
	{
		System.out.println("add");
	}
	public void subTest()
	{
		System.out.println("sub");
	}
	

}
