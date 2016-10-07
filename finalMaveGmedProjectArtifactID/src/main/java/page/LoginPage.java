package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	private By email=By.xpath("//input[@id='txtUserName_TextBox']");
	private By passwd=By.xpath("//input[@id='txtPassword_TextBox']");
	private By signIn=By.id("areaLogin");
	

	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	public void enterUserName(String userName){
		driver.findElement(email).sendKeys(userName);
		}
	
	public void enterPassword(String password){
	
			driver.findElement(passwd).sendKeys(password);
		}

	public HomePage clickLoginButton() throws InterruptedException{
		
		driver.findElement(signIn).click();
		return new HomePage(driver);
	}
	
	
}
