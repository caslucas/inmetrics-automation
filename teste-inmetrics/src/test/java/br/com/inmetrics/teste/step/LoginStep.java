package br.com.inmetrics.teste.step;

import java.io.IOException;

import br.com.inmetrics.teste.pageobject.LoginPageObject;
import br.com.inmetrics.teste.util.GenerateNames;
import br.com.inmetrics.teste.util.ReadFile;
import br.com.inmetrics.teste.util.WebElementsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	public WebElementsActions actions					 	= new WebElementsActions();
	public LoginPageObject loginPage 						= new LoginPageObject();
	public GenerateNames genNames 							= new GenerateNames();
	public ReadFile readFile 								= new ReadFile();

	@When("informar o nome do usuario de login")
	public void informar_o_nome_do_usuario_de_login() throws IOException {
		String name = readFile.readFile("user");
		actions.clickAndWriter(loginPage.userField, name);
	}

	@And("informar a senha")
	public void informar_a_senha() throws IOException {
		String password = readFile.readFile("password");
		actions.clickAndWriter(loginPage.passwordField, password);
	}

	@Then("o usuario devera clicar no botao de entrar")
	public void o_usuario_devera_clicar_no_botao_de_entrar() {
		actions.clickAndWriter(loginPage.entterButton, null);
	}


}
