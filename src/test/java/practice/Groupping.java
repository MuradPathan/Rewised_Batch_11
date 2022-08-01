package practice;

import org.testng.annotations.Test;

public class Groupping {

	@Test(groups="Sanity")
	public void M1() {
		System.out.println("Test M1");
	}
	
	@Test(groups="Regression")
	public void M2() {
		System.out.println("Test M2");
	}
	
	@Test(groups="Retesting")
	public void M3() {
		System.out.println("Test M3");
	}
	
	
}

