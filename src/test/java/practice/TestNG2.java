package practice;

import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	public void a() {
		System.out.println("Test a");
	}
	@Test
	public void b() {
		System.out.println("Test b");
	}
	@Test(dependsOnMethods= {"e"})
	public void c() {
		System.out.println("Test c");
	}
	@Test
	public void d() {
		System.out.println("Test d");
	}
	@Test
	public void e() {
		System.out.println("Test e");
	}
}
