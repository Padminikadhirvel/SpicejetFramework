package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.FlightStatusPage;

public class FlightStatusTest extends BaseClass{
	@Test
	public void SearchFlightOperation() {
		FlightStatusPage status=new FlightStatusPage(driver);
		status.SelectFlightStatus();
		status.SelectDepartureDate();
		status.Enterplacedetails();
		status.Enterflightnumber(prop.getProperty("FlightNo"));
		status.FlightStatusbtn();
	}
}
