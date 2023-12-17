package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Utility;

public class Lenders_page extends Utility {
	public WebDriver driver;

	public Lenders_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//button[@class='btn btn-default pull-right'])[3]")
	WebElement lennxtbtn;
	@FindBy(xpath = "(//button[@class='btn btn-default pull-right'])[4]")
	WebElement chrgnxtbtn;

	public void lennxtbtn() {

		lennxtbtn.click();
	}

	public void chrgnxtbtn() {

		chrgnxtbtn.click();

	}

}
