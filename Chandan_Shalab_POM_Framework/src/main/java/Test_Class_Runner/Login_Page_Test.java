package Test_Class_Runner;

import Browser_Config.Browser_Launcher;
import SignUp_Login_Pages.Login_Page;

public class Login_Page_Test extends Browser_Launcher
{

	public static void main(String[] args) 
	{
		
		String browser_type ="chrome";
		String test_url ="http://mykidsbank.org/";
		Login_Page_Test test = new Login_Page_Test();
		test.browser(browser_type, test_url);
		
		Login_Page lp = new Login_Page(driver);
		lp.Bank_Id();
		lp.User_Name();
		lp.User_Password();
		lp.Login_Btn();
		
	}

}
