package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global 
{
	public WebDriver driver;
	//testdata
	public String url="https://the-internet.herokuapp.com/login";
	public String login_name="tomsmith";
	public String login_password="SuperSecretPassword!";
	//objects
	public String username="username";
	public String password="password";
	public String submit_button="//button[@type=\"submit\"]"; 
	public String logout="//*[@id=\"content\"]/div/a"; 
}
