package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Utility;

public class Createclient_page extends Utility {
	public WebDriver driver;

	public Createclient_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "client-dropdown")
	WebElement clientsdrp;
	@FindBy(xpath = "(//a[text()='Clients'])[1]")
	WebElement clients;
	@FindBy(id = "client_createbutton")
	WebElement creatclt;
	@FindBy(id = "firstname")
	WebElement firstname;
	@FindBy(id = "mobileNo")
	WebElement mobilenum;
	@FindBy(xpath = "(//button[@class='fa fa-plus btn btn-default'])[1]")
	WebElement familymemb;
	@FindBy(name = "firstName_0")
	WebElement familyfstnam;
	@FindBy(id = "relationshipId")
	WebElement famrelation;
	@FindBy(xpath = "((//div[@class='chosen-search'])[8]")
	WebElement fambro;
	@FindBy(xpath = "(//button[@class='fa fa-plus btn btn-default'])[2]")
	WebElement addres;
	@FindBy(xpath = "(//a[@class='chosen-single'])[12]")
	WebElement addtype;
	@FindBy(xpath = "(//input[@type='text'])[56]") // [name='street2']
	WebElement addcurrent;
	@FindBy(name = "street2")
	WebElement addstreet;

	@FindBy(id = "save")
	WebElement submit;

	public void clientsdrp() throws InterruptedException {
		clientsdrp.click();
		Thread.sleep(5000);
		clientsdrp.click();
		Thread.sleep(10000);
		clients.click();
		Thread.sleep(10000);

	}

	public void creatclt() {
		creatclt.click();

	}

	public void createclient() {
		firstname.sendKeys("ram");
		mobilenum.sendKeys("9876543210");

	}

	public void familymembers() throws InterruptedException {
		familymemb.click();
		familyfstnam.sendKeys("puvi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='chosen-single'])[8]")).click();

		select(famrelation, "24", "val");

	}

	public void address() throws InterruptedException {
		addres.click();
		addtype.click();
		Thread.sleep(2000);

		addcurrent.sendKeys("current");
		addstreet.sendKeys("gandhistreet");
	}

	public void submit() {
		submit.click();
	}

}
