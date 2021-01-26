package br.com.inmetrics.main.pageobject;

import org.openqa.selenium.By;

import lombok.Getter;
import lombok.Setter;

public class DeletarRegistroPageObject {
	
	@Getter @Setter public final By userField 					= By.xpath("//input[@name = \"username\"]");
	@Getter @Setter public final By passwordField 				= By.xpath("//input[@name = \"pass\"]");
	@Getter @Setter public final By entterButton 				= By.xpath("//button[contains(normalize-space(text()), \"Entre\")]");
	@Getter @Setter public final By searchField					= By.xpath("//input[@type=\"search\"]");
	@Getter @Setter public final By deleteButton				= By.xpath("//button[@id=\"delete-btn\"]");
	@Getter @Setter public final By popUpSucess					= By.xpath("//div[@class = \"alert alert-success alert-dismissible fade show\"]");

}
