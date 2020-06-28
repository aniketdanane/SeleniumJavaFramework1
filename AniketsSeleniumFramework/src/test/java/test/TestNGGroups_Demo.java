package test;

import org.testng.annotations.Test;

@Test(groups = {"alltest"} )
public class TestNGGroups_Demo {

	
	@Test(groups = {"Smoke"})
	
	public void test1() {

		System.out.println("This is test 1");
	}
	
	@Test(groups = {"Sanity"})
	
	public void test2() {

		System.out.println("This is test 2");
	}
	
	
	@Test(groups = {"Smoke","Sanity"})
	
	public void test3() {

		System.out.println("This is test 3");
	}
	
	@Test(groups = {"Regression"})
	
	public void test4() {

		System.out.println("This is test 4");
	}
	
	@Test(groups = {"Smoke","Sanity","Regression"})
	public void test5() {

		System.out.println("This is test 5");
	}

}
