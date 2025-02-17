package com.hrms.testscripts;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
public class testng_eg1 
{
	WebDriver driver;
	@BeforeClass
	public void startUp()
	{
		driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void tc001() throws Exception
	{
		FileInputStream fin=new FileInputStream("E:\\NARESH IT\\SOFTWARE TESTING\\EXCEL\\LoginExcelAdct.xls");
		Workbook wb=Workbook.getWorkbook(fin);
		Sheet sh=wb.getSheet(0);
		String log_name=sh.getCell(0,1).getContents();
		String log_pwd=sh.getCell(1,1).getContents();
		Reporter.log(log_name);
		Reporter.log(log_pwd);
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(log_name);
		driver.findElement(By.id("password")).sendKeys(log_pwd);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
	}
}
