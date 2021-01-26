package br.com.inmetrics.main.pageobject;

import org.openqa.selenium.By;

import lombok.Getter;
import lombok.Setter;

public class EditarRegistroFuncionarioPageObject {
	
	@Getter @Setter public final By userField 					= By.xpath("//input[@name = \"username\"]");
	@Getter @Setter public final By passwordField 				= By.xpath("//input[@name = \"pass\"]");
	@Getter @Setter public final By entterButton 				= By.xpath("//button[contains(normalize-space(text()), \"Entre\")]");
	@Getter @Setter public final By searchField					= By.xpath("//input[@type=\"search\"]");
	@Getter @Setter public final By editButton					= By.xpath("//span[@class=\"fa fa-pencil\"]");
	@Getter @Setter public final By office						= By.xpath("//input[@id=\"inputCargo\"]");
	@Getter @Setter public final By money						= By.xpath("//input[@id=\"dinheiro\"]");
	@Getter @Setter public final By registerFunctionary			= By.xpath("//input[@class=\"cadastrar-form-btn\"]");
	@Getter @Setter public final By popUpSucess					= By.xpath("//div[@class = \"alert alert-success alert-dismissible fade show\"]");
}
