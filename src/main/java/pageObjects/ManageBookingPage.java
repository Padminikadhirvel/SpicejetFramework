package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageBookingPage {
	public WebDriver driver;
	public ManageBookingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(text(),'manage booking')]")
	WebElement managebookingtab;
	@FindBy(xpath="//input[@placeholder='e.g. W3X3H8']")
	WebElement pnrinput;
	@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com / Doe']")
	WebElement emailid;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]")
	WebElement searchbookingbtn;
	@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-1enofrn r-1bymd8e']")
	WebElement errorpnr;
	public void SelectManageBookingTab() {
		managebookingtab.click();
	}
	public void EnterPNR(String pnrnumber) {
		pnrinput.sendKeys(pnrnumber);
	}
	public void EnterEmail(String email) {
		emailid.sendKeys(email);
	}
	public void SearchBooking() {
		searchbookingbtn.click();
		Assert.assertEquals(errorpnr.getText(),"Valid PNR or Ticket Number");
		System.out.println("Enter Valid PNR/Ticket number");
	}
	
}
