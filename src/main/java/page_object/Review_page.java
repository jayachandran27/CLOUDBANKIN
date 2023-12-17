package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Utility;

public class Review_page extends Utility {
	public WebDriver driver;

	public Review_page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "save")
	WebElement sbtnxtbtn;
	@FindBy(xpath = "(//span[@class='btn btn-primary ng-binding ng-scope'])[2]")
	WebElement approve;
	@FindBy(id = "save")
	WebElement approveloan;

	public void sbtnxtbtn() {
		sbtnxtbtn.click();

	}

	public void approve() {

		approve.click();

	}

	public void approveloan() {
		approveloan.click();
	}

}
