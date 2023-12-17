package baseclass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilies.Utility;

public class Base extends Utility {

	@BeforeMethod

	public void startup() throws IOException, InterruptedException {
		driver = intitalizedriver();
		driver.get(pro.getProperty("url"));

	}

	@AfterMethod
	public void close() {
		driver.quit();

	}
}
