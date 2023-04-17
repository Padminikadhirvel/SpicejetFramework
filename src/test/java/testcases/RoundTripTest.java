package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass {
	@Test(priority=1)
	public void RoundTripFamilyFriends() {
		RoundTripPage round=new RoundTripPage(driver);
		round.RoundTripbtn();
		round.Onboarding(prop.getProperty("Fromplace"));
		round.departure(prop.getProperty("Toplace"));
		round.boardingdate();
		round.returndate();
		int a=Integer.parseInt(prop.getProperty("Adult"));  
		int c=Integer.parseInt(prop.getProperty("Child"));  
		int i=Integer.parseInt(prop.getProperty("Infant"));  
		round.addpassengers(a,c,i);
		round.searchflight();
		round.selectfarecontinue();
		round.entercontactdetails(prop.getProperty("FirstName"),prop.getProperty("LastName"),prop.getProperty("MobileNumber"),prop.getProperty("Emailid"),prop.getProperty("City"));
		round.enterpassenger1details(prop.getProperty("P1FName"), prop.getProperty("P1LName"), prop.getProperty("P1Mob"));
		round.enterpassenger2details(prop.getProperty("P2FName"), prop.getProperty("P2LName"), prop.getProperty("P2Mob"));
		round.enterpassenger3details(prop.getProperty("P3FName"), prop.getProperty("P3LName"));
		round.enterpassenger4details(prop.getProperty("P4FName"), prop.getProperty("P4LName"));
		round.continuebooking();
		round.getsummary();
		round.enterpaymentdetail(prop.getProperty("CardNumber"),prop.getProperty("CardHolder"),prop.getProperty("expmon"),prop.getProperty("expyear"),prop.getProperty("cvv"));
				
	}
	
	@Test(priority=2)
	public void RoundTripStudents() {
		RoundTripPage round=new RoundTripPage(driver);
		round.RoundTripbtn();
		round.Onboarding(prop.getProperty("Fromplace"));
		round.departure(prop.getProperty("Toplace"));
		round.boardingdate();
		round.returndate();
		round.Students();
		round.searchflight();
		round.selectfarecontinue();
	}
}
