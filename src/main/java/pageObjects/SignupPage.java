package pageObjects;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
public class SignupPage {
public WebDriver driver;
	public SignupPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signup;
	@FindBy(xpath="//select[@class='form-control form-select ']/ option[@value='MRS']")
	WebElement title;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmpassword;
//	@FindBy(xpath="//input[@id='defaultCheck1']")
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement agreementcheck;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[7]/div[1]/a[1]/button[1]")
	WebElement submitbutton;
//	WebElement submitbutton =(WebElement)new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[7]/div[1]/a[1]/button[1]")));
	@FindBy(xpath="//div[contains(text(),'Member account exists with given email ID')]")
	WebElement userexistemail;
	@FindBy(xpath="//div[contains(text(),'Member account exists with given mobile number')]")
	WebElement userexistmob;
	public void Signup() {
		signup.click();
	}
	public void SelectTitle() {
//		System.out.println(driver.getTitle());
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("SpiceClub - The frequent flyer program of SpiceJet"));
		title.click();
	}
	public void Alertmsg() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.alertIsPresent());
//		driver.manage().timeouts().setScriptTimeout(10,null);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	public void Firstname(String FirstName) {
		firstname.sendKeys(FirstName);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(firstname));
	}
	public void Lastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	public void EnterCountry(String Country) {
		country.sendKeys(Country);
	}
	public void DateOfBirth(String DOB) {
		dateofbirth.sendKeys(DOB);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,300)");
	}
	public void MobileNumber(String MobileNumber) {
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", mobilenumber);
		mobilenumber.sendKeys(MobileNumber);
//		mobilenumber.click();
	}
	public void Emailid(String Email) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.click();
		email.sendKeys(Email);
		
	}
	public void EnterPassword(String Password) {
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", password);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(Password);
	}
	public void ConfirmPassword(String Confirmpassword) {
		confirmpassword.sendKeys(Confirmpassword);
	}
	public void agreementCheck() {
//		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", agreementcheck);
		agreementcheck.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(agreementcheck));
		
//		Thread.sleep(1000);

//	
	}
	public void signupSubmitForm() {
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitbutton);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(submitbutton));
		submitbutton.click();
		
	}
	public void userexist() {
		try {
			Assert.assertEquals(userexistmob.getText(), "Member account exists with given mobile number");
			System.out.println("User Already Exist");
		} catch (NoSuchElementException e) {
			Assert.assertEquals(userexistemail.getText(), "Member account exists with given email ID");
			System.out.println("User Already Exist");
		}
	}
}
