package com.hrms.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eg_testng 
{
	@Test(priority=0)
	public void aa()
	{
		System.out.println("a");
	}
	@Test(priority=-1)
	public void ad()
	{
		System.out.println("d");
	}
	@AfterMethod
	public void ab()
	{
		System.out.println("b");
	}
	@BeforeMethod
	public void ac()
	{
		System.out.println("c");
		System.out.println("GitDemo person X");
		System.out.println("GitDemo person Y");
	}
}
