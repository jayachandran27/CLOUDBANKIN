package testcases;

import org.testng.annotations.Test;

import baseclass.Base;
import page_object.Createclient_page;

public class Createclient_test extends Base {

	@Test

	public static void createclient() throws InterruptedException {

		Createclient_page crclit = new Createclient_page(driver);
		Login_test.Login();
		crclit.clientsdrp();

	}

}
