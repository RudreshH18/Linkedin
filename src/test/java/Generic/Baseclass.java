package Generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

    protected WebDriver driver; // Declaring driver as a class-level variable
    protected static final String BaseURL = "https://www.linkedin.com/in/rudresh-rudra-324a95224";
    public String usr = "rudreshrajh1999@gmail.com";
    public String pwd = "rud7026RT$";
    public String src = "Software Test Engineer";
    public String Inp1 = "3";
    public String Inp2 = "3";
    public String Inp3 = "3";
    public String Inp4 = "3";
    public String ctc="800000";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup(); // Set up WebDriver
        driver = new ChromeDriver(); // Initialize the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18)); // Implicit wait
        driver.manage().window().maximize(); // Maximize the window
        
    }

    @BeforeMethod
    public void login() {
        driver.get(BaseURL);
        driver.manage().deleteAllCookies();
        System.out.println("Navigated to: " + BaseURL);

         }

    @AfterClass
    public void Exit() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit(); // Quit browser after tests
    }

    public void setDropdown(WebElement element, String value, boolean byValue) {
        Select s = new Select(element);
        if (byValue) {
            s.selectByValue(value); // Select by value
        } else {
            s.selectByVisibleText(value); // Select by visible text
        }
        
    }
    
}
