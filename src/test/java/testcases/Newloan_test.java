package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import baseclass.Base;
import page_object.Newloan_page;

public class Newloan_test extends Base {

	@Test

	public static void newloan() throws InterruptedException, AWTException {

		Newloan_page newloan = new Newloan_page(driver);
		Createclient_test.createclient();
		newloan.tom();
		newloan.nwloan();
		newloan.selloproduct();
		newloan.disdate();
		newloan.acctype();
		newloan.repay();
		newloan.nxtbtn();
	}

}
