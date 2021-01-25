package br.com.inmetrics.teste.pageobject;

import org.openqa.selenium.By;

import lombok.Getter;
import lombok.Setter;

public class CadastroFuncionarioPageObject {
	
	@Getter @Setter public final By userField 					= By.xpath("//input[@name = \"username\"]");
	@Getter @Setter public final By passwordField 				= By.xpath("//input[@name = \"pass\"]");
	@Getter @Setter public final By entterButton 				= By.xpath("//button[contains(normalize-space(text()), \"Entre\")]");
	@Getter @Setter public final By newEmployeeButton   		= By.xpath("//a[contains(normalize-space(text()), \"Novo Funcionário\")]");
	@Getter @Setter public final By inputName 					= By.xpath("//input[@id=\"inputNome\"]");
	@Getter @Setter public final By inputCpf 					= By.xpath("//input[@id=\"cpf\"]");
	@Getter @Setter public final By boxSelect					= By.xpath("//select[@id=\"slctSexo\"]");
	@Getter @Setter public final By adimission					= By.xpath("//input[@id=\"inputAdmissao\"]");
	@Getter @Setter public final By office						= By.xpath("//input[@id=\"inputCargo\"]");
	@Getter @Setter public final By money						= By.xpath("//input[@id=\"dinheiro\"]");
	@Getter @Setter public final By officeType					= By.xpath("//input[@id=\"clt\"]");
	@Getter @Setter public final By registerFunctionary			= By.xpath("//input[@class=\"cadastrar-form-btn\"]");
	@Getter @Setter public final By popUpSucess					= By.xpath("//div[@class = \"alert alert-success alert-dismissible fade show\"]");

}
