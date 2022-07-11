package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class HomeCalculator extends Base{
	WebDriver driver;
	By CurrentAgeX=By.xpath("//input[@id= 'current-age']");
	By RetireAgeX= By.xpath("//input[@id= 'retirement-age']");
	By CurrentIncomeX= By.xpath("//input[@id='current-income']");
	By SpouseIncomeX=By.xpath("//input[@id='spouse-income']");
	By RetireSavingX=By.xpath("//input[@id='current-total-savings']");
	By RetireamountX=By.xpath("//input[@id='current-annual-savings']");
	By RateInterestX=By.xpath("//input[@id='savings-increase-rate']");
	By SnumberX=By.xpath("//input[@id='social-security-override']");
	By SubmitX= By.xpath("//button[@onclick='calculateResults();']");
	public  HomeCalculator(WebDriver Driver) {
		this.driver =Driver;

	}

public void SendCurrentAge() throws InterruptedException, IOException{
	 waitForSeconds(5);	
	String currentAge= Getproperties("CAge");
	driver.findElement(CurrentAgeX).sendKeys(currentAge);
	waitForSeconds(2);	
	
	}

public void SendRetireAge() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String RetireAge= Getproperties("RAge");
	driver.findElement(RetireAgeX).sendKeys(RetireAge);
	waitForSeconds(2);	
	
	}
public void SendCurrentIncome() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String CurrentIncome= Getproperties("CIncome");
	driver.findElement(CurrentIncomeX).click();
	driver.findElement(CurrentIncomeX).sendKeys(CurrentIncome);
	waitForSeconds(2);	
	
	}
public void SendSpouseIncome() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String SpouseIncome= Getproperties("SIncome");
	driver.findElement(SpouseIncomeX).click();
	driver.findElement(SpouseIncomeX).sendKeys(SpouseIncome);
	waitForSeconds(2);	
	
	}
public void SendretirementSaving() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String RetireSaving= Getproperties("RSaving");
	driver.findElement(RetireSavingX).click();
	driver.findElement(RetireSavingX).sendKeys(RetireSaving);
	waitForSeconds(2);	
	
	}
public void SendretirementAmount() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String RetireAmount= Getproperties("RAmount");
	driver.findElement(RetireamountX).click();
	driver.findElement(RetireamountX).sendKeys(RetireAmount);
	waitForSeconds(2);	
	
	}

public void SendRateOfInterest() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String RateInterest= Getproperties("RInterest");
	driver.findElement(RateInterestX).click();
	driver.findElement(RateInterestX).sendKeys(RateInterest);
	waitForSeconds(2);	
	
	}
public void SelectSnumber() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String SNumbertoogle= Getproperties("SNumbertoogle");
	driver.findElement(By.xpath("//label[contains(text(), '"+SNumbertoogle +"')]")).click();
	if(SNumbertoogle.equals("Yes")) {
		System.out.println("dsf");
		
		Sendsocial();
	}
	waitForSeconds(2);		
	
	}

public void Sendsocial() throws InterruptedException, IOException{
	waitForSeconds(5);		
	String SocialNumber= Getproperties("Snumber");
	driver.findElement(SnumberX).click();
	driver.findElement(SnumberX).sendKeys(SocialNumber);
	waitForSeconds(2);	
}
public void Submit() throws InterruptedException, IOException{
	waitForSeconds(5);		
	
	driver.findElement(SubmitX).click();
	
	waitForSeconds(2);	
}
}