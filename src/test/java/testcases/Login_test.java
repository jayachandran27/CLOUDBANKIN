package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass.Base;
import page_object.Login_page;




public class Login_test extends Base  {
	
	@Test(priority = 1)
	
	public static void Login() throws InterruptedException {
		
		Login_page lo = new Login_page(driver);
		lo.email(pro.getProperty("email"));
		Thread.sleep(3000);
		lo.passwrd(pro.getProperty("password"));
		lo.loginbtn();
		getpagetitle();
		
		Assert.assertEquals(driver.getTitle(), "CloudBankIN - A Saas Banking Engine");
		
	}
	
	@Test(priority = 2)
	public void loginwithinvalid() throws InterruptedException {
		Login_page lo = new Login_page(driver);
		lo.email("jcmohan7@gmail.com");
		Thread.sleep(10000);
		lo.passwrd("qatest123&");
		lo.loginbtn();
		getpagetitle();
	}
		

		
	

}
