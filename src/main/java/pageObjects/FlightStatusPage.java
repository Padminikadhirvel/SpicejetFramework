package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightStatusPage {
	public WebDriver driver;
	public FlightStatusPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(text(),'flight status')]")
	WebElement flightstatustab;
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']")
	WebElement departuredateclick;
	@FindBy(xpath="//div[normalize-space()='Today']")
	WebElement todaydepartureselect;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")
	WebElement fromplace;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[8]")
	WebElement blr;	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[2]")
	WebElement toplace;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip'])[19]")
	WebElement del;	
	@FindBy(xpath="//input[@value='SG - ']")
	WebElement flightno;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement searchflightbtn;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-1ah4tor r-1otgn73']")
	WebElement flightinfo;
	public void SelectFlightStatus() {
		flightstatustab.click();
	}
	public void SelectDepartureDate() {
		departuredateclick.click();
		todaydepartureselect.click();
	}
	public void Enterplacedetails() {
		fromplace.click();
		blr.click();
		toplace.click();
		del.click();
	}
	public void Enterflightnumber(String flightnum) {
		flightno.click();
		flightno.sendKeys(flightnum);
	}
	public void FlightStatusbtn() {
		searchflightbtn.click();
		try {
			System.out.println(flightinfo.getText());
		} catch (NoSuchElementException e) {
			System.out.println("No such Flight Available.");
			System.out.println("Please select Valid Fligth number/date and Search Again");
		}
	}
}
