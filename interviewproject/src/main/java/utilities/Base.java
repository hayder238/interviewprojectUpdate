package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public WebDriver intialisedDriver() throws IOException {
		String BrowserName= Getproperties("browser");
	if (BrowserName.equals("chrome")) {

	    	WebDriverManager.chromedriver().setup();
	    
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		 
		
	}
	else
		System.out.print(false);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}


	public String Getproperties(String propertyName) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\MSI\\Downloads\\interviewproject\\src\\main\\java\\resources\\datafile.properties");
		prop.load(fis);
		String PropertyValue =prop.getProperty(propertyName);
		return PropertyValue;
	}
	  public void waitForSeconds(int secs) {
	        try {
	            Thread.sleep(secs * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
