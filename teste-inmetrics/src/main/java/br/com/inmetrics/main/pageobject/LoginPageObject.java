package br.com.inmetrics.main.pageobject;

import org.openqa.selenium.By;

import lombok.Getter;
import lombok.Setter;

public class LoginPageObject {
	
	@Getter @Setter public final By userField 					= By.xpath("//input[@name = \"username\"]");
	@Getter @Setter public final By passwordField 				= By.xpath("//input[@name = \"pass\"]");
	@Getter @Setter public final By entterButton 				= By.xpath("//button[contains(normalize-space(text()), \"Entre\")]");

}
