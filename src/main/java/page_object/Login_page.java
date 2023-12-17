package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;

	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement useremail;
	@FindBy(id = "pwd")
	WebElement passwrd;
	@FindBy(id = "login-button")
	WebElement loginbtn;

	public void email(String email) {
		useremail.sendKeys(email);

	}

	public void passwrd(String password) {
		passwrd.sendKeys(password);
	}

	public void loginbtn() {
		loginbtn.click();

	}

}
