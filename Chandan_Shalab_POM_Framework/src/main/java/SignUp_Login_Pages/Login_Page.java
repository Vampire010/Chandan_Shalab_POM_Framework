package SignUp_Login_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser_Config.Browser_Launcher;

public class Login_Page 
{
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	WebElement Bnk_Id;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")
	WebElement Usr_Nme;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")
	WebElement Usr_Pswd;
	
	@FindBy(xpath = "//*[@id=\"clicked_when_enter_id\"]")
	WebElement Lgn_Btn;

	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Bank_Id()
	{
		Bnk_Id.sendKeys("71225");
	}
	public void User_Name()
	{
		Usr_Nme.sendKeys("banker");
	}
	public void User_Password()
	{
		Usr_Pswd.sendKeys("girish1234");
	}
	
	public void Login_Btn()
	{
		Lgn_Btn.click();	
		
	}
	
}
