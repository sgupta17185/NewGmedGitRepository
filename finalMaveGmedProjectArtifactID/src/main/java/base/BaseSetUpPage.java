package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class BaseSetUpPage extends Assert{
	public WebDriver driver;
	public String developUrl="http://gmedbuild01/Develop/gcare/"; 
	public String enhanceUrl="http://gmedbuild01/Enhance/gcare/"; 
	public String releaseUrl="http://gmedbuild01/Release/gcare/"; 
	public String stagingUrl="http://gmedstaging64/b600/gcare/";

	public String url=new String();
	public BaseSetUpPage(){
		url=developUrl;
		System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	public void manageBrowserSetting(){
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void openBrowser(String url){
		driver.get(url);
	}
	public void tearDown(){
		driver.quit();
	}
	public void switchDefaultFrame(){
		driver.switchTo().defaultContent(); // you are now outside both frames
	}
	public void switchFrame(String frame){
		driver.switchTo().frame(frame);
	}
	public void pressTab(){
		WebElement Element = driver.findElement(By.className("TextBoxBorderLessNoFocus"));
		Element.sendKeys(Keys.TAB);

	}
}

