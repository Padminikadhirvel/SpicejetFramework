package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.ManageBookingPage;

public class ManageBookingTest extends BaseClass {
	@Test
	public void ManageBookingOperation() {
		ManageBookingPage manage=new ManageBookingPage(driver);
		manage.SelectManageBookingTab();
		manage.EnterPNR(prop.getProperty("PNR"));
		manage.EnterEmail(prop.getProperty("Emailid"));
		manage.SearchBooking();
	}

}
