package listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listener.TestNGListener.class)
public class TestNGListenerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("I am inside test1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside test2");
		
	}
	@Test (priority=  0)
	public void test3()
	{
		System.out.println("I am inside test3");
		
	}
	
	@Test(priority=  1)
	public void test4()
	{
		System.out.println("I am inside test3");
		
	}
	
	

}
