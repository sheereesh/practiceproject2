package util;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	private static WebDriver driver;

	private static Properties	value;
	public WebDriver invokeBrowser() {
		PropertyReader obj_PropertyReader=new PropertyReader();
		value=obj_PropertyReader.propertyReader();
		if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions obj_ChromeOptions=new ChromeOptions();
			obj_ChromeOptions.addArguments("Incoginito");
			obj_ChromeOptions.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(value.getProperty("url"));
		}
		else
		{
			System.out.println("no appropiate driver found");

		}
		return driver;
	}

	public WebDriver  getUrl() {

		driver.get(value.getProperty("url"));
		return driver;
	}

}
