package br.com.inmetrics.main.pageobject;

import org.openqa.selenium.By;

import lombok.Getter;
import lombok.Setter;

public class CadastroUsuarioPageObject {
	
	@Getter @Setter public final By registerButton 		 		= By.xpath("//a[contains(normalize-space(text()), \"Cadastre-se\")]");
	@Getter @Setter public final By userField 					= By.xpath("//input[@name = \"username\"]");
	@Getter @Setter public final By passwordField 				= By.xpath("//input[@name = \"pass\"]");
	@Getter @Setter public final By confirmPasswordField 		= By.xpath("//input[@name= \"confirmpass\"]");
	@Getter @Setter public final By registerUserButton 			= By.xpath("//button[contains(normalize-space(text()), \"Cadastrar\")]");
}
