package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Utility;

public class Terms_page extends Utility {
	public WebDriver driver;

	public Terms_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "repaymentFrequencyNthDayType")
	WebElement repayntype;
	@FindBy(id = "repaymentFrequencyDayOfWeekType")
	WebElement repayday;
	@FindBy(xpath = "(//button[@class='btn btn-default pull-right'])[2]")
	WebElement termnxt;

	public void repayntype() throws InterruptedException {

		repayntype.click();
		select(repayntype, "number:1", "val");
		Thread.sleep(3000);
		repayday.click();
		select(repayday, "number:1", "val");

	}

	public void termnxt() {
		termnxt.click();
	}

}
