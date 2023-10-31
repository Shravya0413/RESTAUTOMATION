package com.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchSwitch {

	public static void main(String[] args) {
		WebDriver driver;
		// TODO Auto-generated method stub
switch("chrome") { 
case "chrome":
	System.setProperty("Webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	
	driver=new ChromeDriver();
	break;
case "firefox":
	System.setProperty(null, null);
	driver = new FirefoxDriver();
	break;
default :
	
	System.out.println("please check the input");
	break;
	
}

}
	}


