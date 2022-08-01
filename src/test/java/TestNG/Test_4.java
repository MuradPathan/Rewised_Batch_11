package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_4 {

	@Test(groups="Sanity")
	public void A() {
		System.out.println("A Test");
	}
	@Test(enabled=false)
	public void Z() {
		System.out.println("Z Test");
	}
	@Test
	public void G() {
		System.out.println("G Test");
	}
	
	@Test
	public void H() {
		System.out.println("H Test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"H"})
	public void R() {
		System.out.println("R Test");
	}
	
	
}

