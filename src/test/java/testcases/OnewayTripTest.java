package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OnewayTripPage;




public class OnewayTripTest extends BaseClass{
	@Test(priority=1)
	public void OnewayFamilyFriends()
	{
		OnewayTripPage oneway=new OnewayTripPage(driver);
		oneway.Onewaybtn();
		oneway.Onboarding(prop.getProperty("Fromplace"));
		oneway.departure(prop.getProperty("Toplace"));
		oneway.boardingdate();
		int a=Integer.parseInt(prop.getProperty("Adult"));  
		int c=Integer.parseInt(prop.getProperty("Child"));  
		int i=Integer.parseInt(prop.getProperty("Infant"));  
		oneway.addpassengers(a,c,i);
		oneway.searchflight();
		oneway.selectfarecontinue();
		oneway.entercontactdetails(prop.getProperty("FirstName"),prop.getProperty("LastName"),prop.getProperty("MobileNumber"),prop.getProperty("Emailid"),prop.getProperty("City"));
		oneway.enterpassenger1details(prop.getProperty("P1FName"), prop.getProperty("P1LName"), prop.getProperty("P1Mob"));
		oneway.enterpassenger2details(prop.getProperty("P2FName"), prop.getProperty("P2LName"), prop.getProperty("P2Mob"));
		oneway.enterpassenger3details(prop.getProperty("P3FName"), prop.getProperty("P3LName"));
		oneway.enterpassenger4details(prop.getProperty("P4FName"), prop.getProperty("P4LName"));
		oneway.continuebooking();
		oneway.getsummary();
		oneway.enterpaymentdetail(prop.getProperty("CardNumber"),prop.getProperty("CardHolder"),prop.getProperty("expmon"),prop.getProperty("expyear"),prop.getProperty("cvv"));
		
	}

	@Test(priority=4)
	public void OnewayStudents()
	{
		OnewayTripPage oneway=new OnewayTripPage(driver);
		oneway.Onewaybtn();
		oneway.Onboarding(prop.getProperty("Fromplace"));
		oneway.departure(prop.getProperty("Toplace"));
		oneway.boardingdate();
		oneway.Students();
		oneway.searchflight();
		oneway.acceptterm();
		oneway.selectfarecontinue();

	}
	
}