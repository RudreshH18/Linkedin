package objectclass;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Generic.Baseclass;
import org.openqa.selenium.By;
public class Jobs {
	WebDriver ldriver;
	  public Jobs (WebDriver rdriver) {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	

	
	
	
	
	@FindBy(xpath = "//button[@class=\"authwall-join-form__form-toggle--bottom form-toggle\"]") WebElement Signin;
	@FindBy(xpath = "//input[@autocomplete=\"username\"]") WebElement username;
	@FindBy(xpath = "(//input[@type=\"password\"])[2]") WebElement password;
	@FindBy(xpath = "//button[text()='Show']") WebElement Show;
	@FindBy(xpath = "(//icon[@aria-hidden=\"true\"])[7]") WebElement close;
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")WebElement Sign;
	
	@FindBy(xpath = "//a[@href=\"https://www.linkedin.com/jobs/?\"]") WebElement Jobs;
	@FindBy(xpath = "(//input[@aria-label=\"Search by title, skill, or company\"])[1]") WebElement Search;
	@FindBy(xpath = "//button[@id=\"searchFilter_timePostedRange\"]") WebElement Dateposted;
	@FindBy(xpath = "//span[text()=\"Past 24 hours\"]") WebElement Past24hours;
	@FindBy(xpath = "(//span[@class=\"artdeco-button__text\"])[9]") WebElement ShowList;
	@FindBy(xpath = "//button[@id='searchFilter_applyWithLinkedin']") WebElement Easeapply;
	@FindBy(xpath = "(//div[@class=\"jobs-apply-button--top-card\"])[1]") WebElement Applyease;
	
	
	// @FindBy(xpath = "(//span[@class=\"artdeco-button__text\" and text()='Next'])[1]") WebElement Next;
	@FindBy(xpath = "(//input[@class=\" artdeco-text-input--input\"])[1]") WebElement Input1;
	@FindBy(xpath = "(//input[@class=\" artdeco-text-input--input\"])[2]") WebElement Input2;
	@FindBy(xpath = "(//input[@class=\" artdeco-text-input--input\"])[3]") WebElement Input3;
	@FindBy(xpath = "(//input[@class=\" artdeco-text-input--input\"])[4]") WebElement Input4;
	@FindBy(xpath = "(//label[@class=\"t-14\"])[5]") WebElement Radiobutton5;
	@FindBy(xpath = "//span[text()='Review']") WebElement Review;
	
	//
	public void executeOptionalStep(WebDriver driver) {
	    try {
	        // Check if the element exists and perform an action
	        WebElement Next = driver.findElement(By.xpath("(//span[@class=\\\"artdeco-button__text\\\" and text()='Next'])[1]"));
	       Next.click();  // Perform the step
	        System.out.println("Optional step executed.");
	    } catch (NoSuchElementException e) {
	        // If the element does not exist, skip the step
	        System.out.println("Optional step skipped as the element was not found.");
	    }
	}
	
	public void handleExpectedCTC(WebDriver driver) {
	    // Partial XPath using contains() to locate the text element based on "CTC salary"
	    By expectedCTCTextLocator = By.xpath("//*[contains(text(), 'CTC salary')]");

	    // XPath for the input box where the value needs to be entered
	    By ctcTextBoxLocator = By.xpath("//input[@type='text']");

	    // Check if the partial text "CTC salary" is displayed
	    WebElement ctcTextElement = driver.findElement(expectedCTCTextLocator);

	    if (ctcTextElement.isDisplayed()) { // Ensure the element is visible
	        System.out.println("Text containing 'CTC salary' is displayed.");
	        
	        // Find the input box and set the value to 10000
	        WebElement ctcTextBox = driver.findElement(By.xpath("\"//input[@data-gtm-form-interact-field-id=\\\"1\\\"]"));
	        ctcTextBox.clear(); // Clear the existing text, if any
	        String valueToEnter = "800000"; // Store the value in a string variable
	        ctcTextBox.sendKeys(valueToEnter); 
	        System.out.println("Input box updated with value 800000.");
	    } else {
	        System.out.println("Text containing 'CTC salary' is not displayed.");
	    }
	}

	
	
	
	public void clickSignin() {
	    try {
	    	Signin.click();
	    } catch (Exception e) {
	        System.out.println("Error clicking Sign In: " + e.getMessage());
	    }
	}

	public void setusername (String usr) {
		username.sendKeys(usr);
	}
	public void setpssword (String pwd) {
		password.sendKeys(pwd);
	}
	public void clickshow () {
		Show.click();
	}
	public void clickclose () {
		close.click();
	}
	public void clickSign () {
		Sign.click();
		
	}
	public void clickJobs () {
		Jobs.click();
	}
	public void setsearch (String src) {
		Search.sendKeys(src);
		Actions actions = new Actions(ldriver);
    	actions.sendKeys(Keys.ENTER).perform();
	}
	public void setDateposted () {
	    Dateposted.click();
		
	}
	public void clickPast24hours () {
		Past24hours.click();
		
		/* Baseclass b=new Baseclass();
	    b.setdropdown1(Dateposted1, "Past 24 hours");*/
	}
	public void clickShowList () {
		ShowList.click();
	}
	public void clickEaseapply () {
		Easeapply.click();
	}
	public void clickApplyease () {
		Applyease.click();
	}
	/*public void clickNext () {
		Next.click();
	}*/
	public void clickInput1 (String Inp1) {
		Input1.clear();
		Input1.sendKeys(Inp1);
	}
	public void clickInput2 (String Inp2) {
		Input2.clear();
		Input2.sendKeys(Inp2);
	}
	public void clickInput3 (String Inp3) {
		Input3.clear();
		Input3.sendKeys(Inp3);
	}
	public void clickInput4 (String Inp4) {
		Input4.clear();
		Input4.sendKeys(Inp4); ;
	}
	public void clickRadiobutton5 () {
		Radiobutton5.click();
	}
	public void clickReview () {
		Review.click();
	}



	public void ctcTextBox(String ctc) {
		// TODO Auto-generated method stub
		
	}

	public void Next() {
	// TODO Auto-generated method stub
		
	}
	
	
	
}

