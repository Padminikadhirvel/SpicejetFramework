package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;


public class LoginTest extends BaseClass{
@Test(priority=1)
	public void LoginwithValidCredentials1() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.EmailButton();
	login.EmailId(prop.getProperty("Emailid"));
	login.Password(prop.getProperty("Password"));
	login.ValidCredentialLoginButton();
	}
@Test(priority=2)
	public void LoginwithInvalidPassword() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.EmailButton();
	login.EmailId(prop.getProperty("Emailid"));
	login.Password(prop.getProperty("InvalidPass"));
	login.InvalidCredentialLoginButton();
	}
	@Test(priority=3)
	public void LoginwithInvalidEmail() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.EmailButton();
	login.EmailId(prop.getProperty("InvalidEmail"));
	login.Password(prop.getProperty("Password"));
	login.InvalidCredentialLoginButton();
	}
	@Test(priority=4)
	public void LoginwithInvalidCredentials1() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.EmailButton();
	login.EmailId(prop.getProperty("InvalidEmail"));
	login.Password(prop.getProperty("InvalidPass"));
	login.InvalidCredentialLoginButton();
	}
	@Test(priority=5)
	public void LoginwithValidMobileCredentials1() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.MobileNumber(prop.getProperty("MobileNumber"));
	login.Password(prop.getProperty("Password"));
	login.ValidCredentialLoginButton();
	}
@Test(priority=6)
	public void LoginwithMobileInvalidPassword() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.MobileNumber(prop.getProperty("MobileNumber"));
	login.Password(prop.getProperty("InvalidPass"));
	login.InvalidCredentialLoginButton();
	}
	@Test(priority=7)
	public void LoginwithInvalidMobilenumber() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.MobileNumber(prop.getProperty("P1Mob"));
	login.Password(prop.getProperty("Password"));
	login.InvalidCredentialLoginButton();
	}
	@Test(priority=8)
	public void LoginwithInvalidMobileCredentials1() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	//login.EmailButton();
	login.MobileNumber(prop.getProperty("P1Mob"));
	login.Password(prop.getProperty("InvalidPass"));
	login.InvalidCredentialLoginButton();
	}
}