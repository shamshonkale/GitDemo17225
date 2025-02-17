package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;
public class General extends Global
{
	public void openApp() throws Exception
	{
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened...!");
		Reporter.log("Application Opened Html Report...!");
		Log.info("Application Opened Log file...!");
		Thread.sleep(3000);
	}
	public void closeApp() throws Exception
	{
		driver.close();
		Reporter.log("Application Closed Html Report...!");
		Log.info("Application Closed Log file...!");
	}
	public void login() throws Exception
	{
		driver.findElement(By.id(username)).sendKeys(login_name);
		driver.findElement(By.id(password)).sendKeys(login_password);
		driver.findElement(By.xpath(submit_button)).click();
		Thread.sleep(3000);
		Reporter.log("Application Login Html Report...!");
		Log.info("Application Login Log file...!");
	}
	public void logout() throws Exception
	{
		driver.findElement(By.xpath(logout)).click();
		Thread.sleep(3000);
		Reporter.log("Application Logout Html Report...!");
		Log.info("Application Logout Log file...!");
	}
}
