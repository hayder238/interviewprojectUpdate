package testsuite;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.Base;
import pageObject.HomeCalculator;

public class calculator extends Base {

	@BeforeTest
	public void intialize() throws IOException {
		driver = intialisedDriver();

		String g = Getproperties("url");
		Assert.assertNotNull(g);
		driver.get(g);
	}

	@Test
	public void Startretirementplan() throws IOException, InterruptedException {
		HomeCalculator DP = new HomeCalculator(driver);
		DP.SendCurrentAge();
		DP.SendRetireAge();
		DP.SendCurrentIncome();
		DP.SendSpouseIncome();
		DP.SendretirementAmount();
		DP.SendretirementSaving();
		DP.SendRateOfInterest();
		DP.SelectSnumber();
		DP.Submit();

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
