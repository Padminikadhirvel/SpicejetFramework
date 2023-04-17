package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RoundTripPage {
	public WebDriver driver;
	public RoundTripPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(text(),'round trip')]")
	WebElement roundbutton;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingFrom;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[14]")
	WebElement delhi;	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement departuredate;	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][contains(text(),'29')])[1]")
	WebElement apr29;	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement returndate;
	@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-1'])[2]")
	WebElement may1;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement addpassenger;
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement increaseadult;
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	WebElement increasechild;
	@FindBy(xpath="//div[@data-testid='Infant-testID-plus-one-cta']")
	WebElement increaseinfant;
	@FindBy(xpath="//div[contains(text(),'Family & Friends')]")
	WebElement familyfriends;
	@FindBy(xpath="//div[text()='Senior Citizen']")
	WebElement seniorcitizen;
	@FindBy(xpath="//div[text()='Unaccompanied Minor']")
	WebElement unaccompaniedminor;
	@FindBy(xpath="//div[text()='Students']")
	WebElement students;
	@FindBy(xpath="//div[text()='Armed Forces']")
	WebElement armedforces;
	@FindBy(xpath="(//div[text()='Govt. Employee'])[1]")
	WebElement govtemployee;
	@FindBy(xpath="(//div[text()='Special Assistance'])[1]")
	WebElement splassistance;
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflightbtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='rect'][1]")
	WebElement checkacceptterm;
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]")
	WebElement acceptbtn;
	@FindBy(xpath="//div[@data-testid='spiceflex-flight-select-radio-button-2']")
	WebElement sg534fare;
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement flightcontinue;
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52']")
	WebElement contacttitle;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[2]")
	WebElement contacttitleselect;
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement contactfname;
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement contactlname;
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement contactmobno;
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement contactemail;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
	WebElement contactcountry;
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement contacttowncity;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-19554kt r-184en5c']")
	WebElement pas1title;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement pas1titleselect;	
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement pas1fname;
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement pas1lname;
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement pas1mobno;
	@FindBy(xpath="//input[@data-testid='traveller-0-date-of-birth-field']")
	WebElement pas1dateofbirth;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-edyy15 r-q4m81j'])[2]")
	WebElement pas1yob;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-edyy15 r-q4m81j'])[3]")
	WebElement pas1mob;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-1awozwy r-14lw9ot r-qsz3a2 r-6koalj r-poiln3 r-1r8g8re r-1777fci r-1acpoxo'])[3]")
	WebElement pas1dob;
	@FindBy(xpath="//div[@data-testid='traveller-0-travel-info-cta']")
	WebElement pas1next;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-19554kt r-184en5c']")
	WebElement pas2title;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[2]")
	WebElement pas2titleselect;
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement pas2fname;
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement pas2lname;
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement pas2mobno;
	@FindBy(xpath="//div[@data-testid='traveller-1-travel-info-cta']")
	WebElement pas2next;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[2]")
	WebElement pas3title;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[2]")
	WebElement pas3titleselect;
	@FindBy(xpath="//input[@data-testid='traveller-2-first-traveller-info-input-box']")
	WebElement pas3fname;
	@FindBy(xpath="//input[@data-testid='traveller-2-last-traveller-info-input-box']")
	WebElement pas3lname;
	@FindBy(xpath="//div[@data-testid='traveller-2-travel-info-cta']")
	WebElement pas3next;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[2]")
	WebElement pas4title;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement pas4titleselect;
	@FindBy(xpath="//input[@data-testid='first-traveller-0-infant-information']")
	WebElement pas4fname;
	@FindBy(xpath="//input[@data-testid='last-traveller-0-infant-information']")
	WebElement pas4lname;
	@FindBy(xpath="//input[@data-testid='date-of-birth-traveller-0-infant-information']")
	WebElement pas4dateofbirth;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-edyy15 r-q4m81j'])[2]")
	WebElement pas4yob;	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-edyy15 r-q4m81j'])[6]")
	WebElement pas4mob;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-1awozwy r-14lw9ot r-qsz3a2 r-6koalj r-poiln3 r-1r8g8re r-1777fci r-1acpoxo'])[14]")
	WebElement pas4dob;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[3]")
	WebElement pas4with;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement pas4withselect;
	@FindBy(xpath="//div[contains(text(),'Trip Summary')]")
	WebElement summarytitle;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-c20mna r-poiln3 r-1inkyih'])[1]")
	WebElement tripdeparture;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-c20mna r-poiln3 r-1inkyih'])[2]")
	WebElement tripdestination;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-c20mna r-poiln3 r-1inkyih'])[3]")
	WebElement tripdeparture1;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-c20mna r-poiln3 r-1inkyih'])[4]")
	WebElement tripdestination1;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-zso239'])[1]")
	WebElement tripjourneyflight;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-zso239'])[2]")
	WebElement tripjourneyflight1;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93'])[1]")
	WebElement tripjourneydate;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93'])[2]")
	WebElement tripjourneydate1;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-1f6r7vd'])[1]")
	WebElement tripjourneytime;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-1f6r7vd'])[2]")
	WebElement tripjourneytime1;
	@FindBy(xpath="(//div[contains(text(),'Price Summary')])[1]")
	WebElement pricesummarytitle;
	@FindBy(xpath="(//div[contains(text(),'Price Summary')])[2]")
	WebElement pricesummarytitle1;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-zso239 r-oyd9sg']")
	WebElement pricesummary;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-adyw6z r-1kfrs79'])[3]")
	WebElement payableamt;
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement amtverifycontinue;
	@FindBy(xpath="//div[@id='at_addon_close_icon']")
	WebElement ataddonclose;
	@FindBy(xpath="//span[@id='skipfrompopup']")
	WebElement skipclose;
	@FindBy(xpath="//div[@data-testid='add-ons-continue-footer-button']")
	WebElement addoncontinue1;
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement addoncontinue2;
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardnumber;
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement cardholder;
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement expmonth;
	@FindBy(xpath="//input[@id='card_exp_year']")
	WebElement expyear;
	@FindBy(xpath="//input[@id='security_code']")
	WebElement cvv;
	@FindBy(xpath="//div[@id='payment_form_card_number_error']")
	WebElement cardnumbererror;
	public void RoundTripbtn() {
			roundbutton.click();
		}
	public void Onboarding(String Fromplace) {
		boardingFrom.click();
		boardingFrom.sendKeys(Fromplace);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.textToBePresentInElementValue(boardingFrom, From));
	}
	public void departure(String Toplace) {
		destination.sendKeys(Toplace);
		delhi.click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.textToBePresentInElementValue(destination, To));
	}
	public void boardingdate() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(departuredate));

		try {
			apr29.click();
		} catch (Exception e) {
			departuredate.click();
			apr29.click();
		}
	}
	public void returndate() {
		may1.click();		
	}
	public void addpassengers(int adult, int child, int infant) {
		addpassenger.click();
		for(int i=1;i<adult;i++) {
			increaseadult.click();
		}
		for(int i=0;i<child;i++) {
			increasechild.click();
		}
		for(int i=0;i<infant;i++) {
			increaseinfant.click();
		}
		addpassenger.click();
	}
	public void selectfamilyfriends() {
		familyfriends.click();
	}
	public void seniorCitizen() {
		seniorcitizen.click();
	}
	public void UnaccompaniedMinor() {
		unaccompaniedminor.click();
	}
	public void Students() {
		students.click();
	}
	public void Armedforces() {
		armedforces.click();
	}
	public void Govtemployee() {
		govtemployee.click();
	}
	public void SplAssistanc() {
		splassistance.click();
	}
	public void searchflight() {
		searchflightbtn.click();
	}
	public void acceptterm() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(checkacceptterm));
		checkacceptterm.click();
		acceptbtn.click();
	}
	public void selectfarecontinue() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(flightcontinue));
		try {
			flightcontinue.click();
		
		} catch (Exception e) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();", flightcontinue);
		}
	}
	public void entercontactdetails(String cfname, String clname, String cmobno, String cemail, String ccity) {
		contacttitle.click();
		contacttitleselect.click();
		contactfname.sendKeys(cfname);
		contactlname.sendKeys(clname);
		contactmobno.sendKeys(cmobno);
		contactemail.sendKeys(cemail);
		contacttowncity.sendKeys(ccity);
	}
	public void enterpassenger1details(String p1fname, String p1lname, String p1mobno) {
		pas1title.click();
		pas1titleselect.click();
		pas1fname.sendKeys(p1fname);
		pas1lname.sendKeys(p1lname);
		pas1mobno.sendKeys(p1mobno);		
		pas1next.click();
	}
	public void enterpassenger2details(String p2fname, String p2lname, String p2mobno) {
		pas2title.click();
		pas2titleselect.click();
		pas2fname.sendKeys(p2fname);
		pas2lname.sendKeys(p2lname);
		pas2mobno.sendKeys(p2mobno);		
		pas2next.click();
	}
	public void enterpassenger3details(String p3fname, String p3lname) {
		pas3title.click();
		pas3titleselect.click();
		pas3fname.sendKeys(p3fname);
		pas3lname.sendKeys(p3lname);
		pas3next.click();
	}
	public void enterpassenger4details(String p4fname, String p4lname) {
		pas4title.click();
		pas4titleselect.click();
		pas4fname.sendKeys(p4fname);
		pas4lname.sendKeys(p4lname);
		pas4dateofbirth.click();
		pas4yob.click();
		pas4mob.click();
		pas4dob.click();
		pas4with.click();
		pas4withselect.click();
	}
	public void enterseniorcitizendetails(String p1fname, String p1lname,String p1mobno) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(pas1title));
		pas1title.click();
		pas1titleselect.click();
		pas1fname.sendKeys(p1fname);
		pas1lname.sendKeys(p1lname);
		pas1mobno.sendKeys(p1mobno);	
		pas4dateofbirth.click();
		pas4yob.click();
		pas4mob.click();
		pas4dob.click();
	}
	public void enterUnaccompaniedMinordetails(String p1fname, String p1lname) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(pas1title));
		pas1title.click();
		pas1titleselect.click();
		pas1fname.sendKeys(p1fname);
		pas1lname.sendKeys(p1lname);
		pas1dateofbirth.click();
		pas1yob.click();
		pas1mob.click();
		pas1dob.click();
	}
	public void continuebooking() {
		amtverifycontinue.click();
//		skipclose.click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(ataddonclose));
//		ataddonclose.click();
		Actions act=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
//			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addoncontinue2);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(addoncontinue2));
			addoncontinue2.click();
			act.doubleClick(addoncontinue2).build().perform();
	    }catch (Exception e){
	    	addoncontinue1.click();
	    	act.doubleClick(addoncontinue1).build().perform();
	  }		
	}
	public void getsummary() {
		
		Assert.assertEquals(summarytitle.getText(), "Trip Summary");

		System.out.println("TRIP JOURNY DETAILS");
		System.out.println("TRIP ONE");
		System.out.println("Departure : "+tripdeparture.getText());
		System.out.println("Destination : "+tripdestination.getText());
		System.out.println("Flight No Details: "+tripjourneyflight.getText());
		System.out.println("Flight Date: "+tripjourneydate.getText());
		System.out.println("Flight Time: "+tripjourneytime.getText());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(pricesummarytitle));
		System.out.println(pricesummarytitle.getText());
		List<WebElement> pricesum=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-zso239 r-oyd9sg']"));
		for(WebElement l1:pricesum) 
		{
			System.out.println(l1.getText());
		}
		System.out.println("TRIP TWO");
		System.out.println("Departure : "+tripdeparture1.getText());
		System.out.println("Destination : "+tripdestination1.getText());
		System.out.println("Flight No Details: "+tripjourneyflight1.getText());
		System.out.println("Flight Date: "+tripjourneydate1.getText());
		System.out.println("Flight Time: "+tripjourneytime1.getText());
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(pricesummarytitle1));
		System.out.println(pricesummarytitle1.getText());
//		pricesummarytitle1.click();
		List<WebElement> pricesum1=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-zso239 r-oyd9sg']"));
		for(WebElement l1:pricesum1) 
		{
			System.out.println(l1.getText());
		}
		System.out.println("PAYABLE AMOUNT : Rs."+payableamt.getText());
		
	}
	public void enterpaymentdetail(String cardno,String cardname,String exmon,String exyr,String cvvno) {

		WebElement frame1;
		try {
			frame1 = driver.findElement(By.xpath("//iframe[contains(@name,'card_number_iframe')]"));
		} catch (NoSuchElementException e) {
			ataddonclose.click();
			frame1 = driver.findElement(By.xpath("//iframe[contains(@name,'card_number_iframe')]"));
		}
		driver.switchTo().frame(frame1);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(cardnumber));
		cardnumber.sendKeys(cardno);
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//iframe[contains(@name,'name_on_card_iframe')]"));
		driver.switchTo().frame(frame2);
		cardholder.sendKeys(cardname);
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//iframe[contains(@name,'card_exp_month_iframe')]"));
		driver.switchTo().frame(frame3);
		expmonth.sendKeys(exmon);
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("//iframe[contains(@name,'card_exp_year_iframe')]"));
		driver.switchTo().frame(frame4);
		expyear.sendKeys(exyr);
		driver.switchTo().defaultContent();
		WebElement frame5=driver.findElement(By.xpath("//iframe[contains(@name,'security_code_iframe')]"));
		driver.switchTo().frame(frame5);
		cvv.sendKeys(cvvno);
		driver.switchTo().defaultContent();
		Assert.assertEquals(cardnumbererror.getText(), " valid card");
		System.out.println("Please Verify your card detais entered here.");
	}
}
