package br.com.inmetrics.teste.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connections {
	

	public static WebDriver driver = null;
	public static String PROPERTY = Properties.getPropertiesSystem(Properties.WEBDRIVER_PROPERTIE);
	public static String PATH = Properties.getPropertiesSystem(Properties.WEBDRIVER_PATH);
	
	public static String getConnection(String url) {
		System.setProperty(PROPERTY, PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return null;
	}
	

}
