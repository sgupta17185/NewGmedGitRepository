package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;
private By appointmentButton=By.id("btnNewsnpAppointment_ImageContainer");
	public HomePage(WebDriver driver){
		
		this.driver=driver;
		
	}
	public AppointmentCreatePage clickAppointmentButton(){
		driver.findElement(appointmentButton).click();
		
		return new AppointmentCreatePage(driver);
	}
}

