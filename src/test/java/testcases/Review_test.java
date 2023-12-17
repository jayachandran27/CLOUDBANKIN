package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import baseclass.Base;
import page_object.Lenders_page;
import page_object.Review_page;
import page_object.Terms_page;

public class Review_test extends Base {

	@Test

	public static void terms() throws InterruptedException, AWTException, IOException {

		Terms_page tempage = new Terms_page(driver);
		Newloan_test.newloan();
		tempage.repayntype();
		tempage.termnxt();

		Lenders_page len = new Lenders_page(driver);
		len.lennxtbtn();
		len.chrgnxtbtn();

		Review_page revi = new Review_page(driver);

		revi.sbtnxtbtn();
		revi.approve();
		revi.approveloan();
		
		

	}

	

}
