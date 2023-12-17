package page_object;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Utility;

public class Newloan_page extends Utility {
	public WebDriver driver;

	public Newloan_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//td[@class='pointer ng-binding'])[1]")
	WebElement tom;
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-offset ng-binding'])[2]")
	WebElement nwloan;
	@FindBy(id = "productId")
	WebElement selloproduct;
	@FindBy(xpath = "//*[@id=\"accountTypeId_chosen\"]/a/div")
	WebElement acctype;
	@FindBy(xpath = "//*[@class='chosen-results']/li[2]")
	WebElement searchbox;
	@FindBy(id = "expectedDisbursementDate")
	WebElement disdate;
	@FindBy(xpath = "//*[@id=\"repaymentModeId_chosen\"]/a/div")
	WebElement repay;
	@FindBy(xpath = "(//*[@class='chosen-results']/li[2])[2]")
	WebElement repaycash;
	@FindBy(xpath = "(//button[@class='btn btn-default pull-right'])[1]")
	WebElement nxtbtn;

	public void tom() {
		tom.click();
	}

	public void nwloan() {
		nwloan.click();
	}

	public void selloproduct() throws InterruptedException {

		selloproduct.click();
		Thread.sleep(4000);
		select(selloproduct, "number:2", "val");
		Thread.sleep(4000);

	}

	public void acctype() throws InterruptedException, AWTException {
		acctype.click();
		Thread.sleep(4000);
		// acctype.sendKeys("Auto Loan");
		searchbox.click();
		Thread.sleep(4000);

	}

	public void disdate() throws InterruptedException {
		disdate.sendKeys("18 December 2023");
		Thread.sleep(3000);

	}

	public void repay() throws InterruptedException {
		repay.click();
		Thread.sleep(4000);
		repaycash.click();
	}

	public void nxtbtn() {
		nxtbtn.click();

	}
}
