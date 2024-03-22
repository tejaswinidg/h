package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;

public loginPage(WebDriver driver) {
	//super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(name="uid")
WebElement username1;



@FindBy(xpath="//input[@name='password']")
WebElement password1;




@FindBy(name="btnLogin")
WebElement loginClick;

public void Login(String username, String password) {
	username1.sendKeys(username);
	password1.sendKeys(password);
	
	
}
public void LoginClick() {
	loginClick.click();
}
}
