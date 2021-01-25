package br.com.inmetrics.teste.step;

import br.com.inmetrics.teste.enums.ChavesSessaoWeb;
import br.com.inmetrics.teste.pageobject.CadastroUsuarioPageObject;
import br.com.inmetrics.teste.util.GenerateNames;
import br.com.inmetrics.teste.util.WebElementsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;

public class CadastroUsuarioStep {
	
	public WebElementsActions actions					 	= new WebElementsActions();
	public CadastroUsuarioPageObject cadastroPage 			= new CadastroUsuarioPageObject();
	public GenerateNames genNames 							= new GenerateNames();

	@When("o usuario clicar no botao cadastre-se")
	public void o_usuario_clicar_no_botao_cadastre_se() {
		actions.clickAndWriter(cadastroPage.registerButton, null);
	}

	@And("informar o nome do usuario")
	public void informar_o_nome_do_usuario() {
		String name = genNames.generateNames();
		actions.clickAndWriter(cadastroPage.userField, name);
		Serenity.setSessionVariable(ChavesSessaoWeb.USER_NAME).to(name);
	}

	@And("informar a senha e confirmar a senha")
	public void informar_a_senha_e_confirmar_a_senha() {
		actions.clickAndWriter(cadastroPage.passwordField, "123456");
		actions.clickAndWriter(cadastroPage.confirmPasswordField, "123456");
		Serenity.setSessionVariable(ChavesSessaoWeb.USER_PASSWORD).to("123456");
	}

	@Then("o usuario devera clicar no botao cadastrar")
	public void o_usuario_devera_clicar_no_botao_cadastrar() {
		actions.clickAndWriter(cadastroPage.registerUserButton, null);
	}

}
