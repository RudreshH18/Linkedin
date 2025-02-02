package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import Generic.Baseclass;
import objectclass.Jobs;

public class TC_JB1 extends  Baseclass{
   @Test
	public void Jobspage () throws InterruptedException {
		
	    driver.get(BaseURL);
        
        Jobs jb = new Jobs(driver);
		
		jb.clickSignin();
		jb.clickclose();
		jb.setusername(usr);
		jb.setpssword(pwd);
		jb.clickshow();
		Thread.sleep(1000);
		jb.clickSign();
		Thread.sleep(1000);
		jb.clickJobs();
		Thread.sleep(1000);
		jb.setsearch(src);
		Thread.sleep(1000);
		jb.setDateposted();
		jb.clickPast24hours();
		Thread.sleep(1000);
		jb.clickShowList();
		Thread.sleep(2000);
		jb.clickEaseapply();
		Thread.sleep(2000);
		jb.clickApplyease();
		//jb.Next();
		//jb.clickNext();
		jb.Next();
		jb.clickInput1(Inp1);
		jb.clickInput1(Inp2);
		jb.clickInput1(Inp3);
		jb.clickInput1(Inp4);
		jb.clickRadiobutton5();
		jb.ctcTextBox(ctc);
		jb.clickReview();
		
		
		
	}

private void waitForVisibility(Object clickSignin, int i) {
	// TODO Auto-generated method stub
	
}


  


		
	
}
