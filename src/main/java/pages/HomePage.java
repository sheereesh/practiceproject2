package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver wd) {
	PageFactory.initElements(wd,this);
		
	}


}


