package Test_Class_Runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser_Config.Browser_Launcher;
import SignUp_Login_Pages.Login_Page;

public class Login_Testng_Runner 
{

	String browser_type ="chrome";
	String test_url ="http://mykidsbank.org/";
	Browser_Launcher tr = new Browser_Launcher();

	@BeforeMethod
	public void open_browser() 
	{
		tr.browser(browser_type, test_url);
	}
	
	@Test
	public void Login_Tc1()
	{
		Login_Page lp = new Login_Page(tr.driver);
		lp.Bank_Id();
		lp.User_Name();
		lp.User_Password();
		lp.Login_Btn();
	}
	
	@AfterMethod
	public void close_browser()
	{
		tr.driver.close();
	}
	
	
	

}
