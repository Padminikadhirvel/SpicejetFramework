package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.CheckinPage;

public class CheckinTest extends BaseClass  {
	@Test
	public void SearchBookingOperation() {
		CheckinPage checkin=new CheckinPage(driver);
		checkin.SelectCheckInTab();
		checkin.EnterPNR(prop.getProperty("PNR"));
		checkin.EnterEmail(prop.getProperty("Emailid"));
		checkin.SearchBooking();
	}

}
