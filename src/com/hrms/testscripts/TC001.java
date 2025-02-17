package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 
{
	@Test
	public void tc001() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General gn=new General();
		gn.openApp();
		gn.login();
		gn.logout();
		gn.closeApp();
		System.out.println("Hello.....!");
	}
}
