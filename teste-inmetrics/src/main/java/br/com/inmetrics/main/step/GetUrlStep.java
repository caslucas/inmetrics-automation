package br.com.inmetrics.main.step;

import java.io.IOException;

import br.com.inmetrics.main.enums.ChavesSessaoWeb;
import br.com.inmetrics.main.pageobject.CadastroUsuarioPageObject;
import br.com.inmetrics.main.pageobject.LoginPageObject;
import br.com.inmetrics.main.util.Connections;
import br.com.inmetrics.main.util.GenerateNames;
import br.com.inmetrics.main.util.ReadFile;
import br.com.inmetrics.main.util.WebElementsActions;
import br.com.inmetrics.main.webs.CadastroFuncionarioWeb;
import br.com.inmetrics.main.webs.CadastroUsuarioWeb;
import br.com.inmetrics.main.webs.LoginWeb;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.Serenity;

public class GetUrlStep {
	
	public WebElementsActions actions					 	= new WebElementsActions();
	public CadastroUsuarioPageObject cadastroPage 			= new CadastroUsuarioPageObject();
	public GenerateNames genNames 							= new GenerateNames();
	public ReadFile readFile 								= new ReadFile();
	public LoginPageObject loginPage 						= new LoginPageObject();
	
	
	@Given("que o usuario acesse a url de cadastro usuario")
	public void que_o_suario_acesse_a_url_de_cadastro_usuario() {
		CadastroUsuarioWeb.getBaseURL();
		Connections.getConnection(Serenity.sessionVariableCalled(ChavesSessaoWeb.CADASTRO_USUARIO_URL).toString());
	}
	
	@Given("que o usuario acesse a url de login")
	public void que_o_usuario_acesse_a_url_de_login() {
		LoginWeb.getBaseURL();
		Connections.getConnection(Serenity.sessionVariableCalled(ChavesSessaoWeb.LOGIN_URL).toString());
	}
	
	@Given("que o usuario acesse a url de cadastro funcionario")
	public void que_o_usuario_acesse_a_url_de_cadastro_funcionario() throws IOException {
		CadastroFuncionarioWeb.getBaseURL();
		Connections.getConnection(Serenity.sessionVariableCalled(ChavesSessaoWeb.CADASTRO_FUNCIONARIO).toString());
		String name = readFile.readFile("user");
		actions.clickAndWriter(loginPage.userField, name);
		String password = readFile.readFile("password");
		actions.clickAndWriter(loginPage.passwordField, password);
		actions.clickAndWriter(loginPage.entterButton, null);
	}
	
	@Given("que o usuario acesse a url para editar cadastro funcionario")
	public void que_o_usuario_acesse_a_url_para_editar_cadastro_funcionario() throws IOException {
		CadastroFuncionarioWeb.getBaseURL();
		Connections.getConnection(Serenity.sessionVariableCalled(ChavesSessaoWeb.CADASTRO_FUNCIONARIO).toString());
		String name = readFile.readFile("user");
		actions.clickAndWriter(loginPage.userField, name);
		String password = readFile.readFile("password");
		actions.clickAndWriter(loginPage.passwordField, password);
		actions.clickAndWriter(loginPage.entterButton, null);
	}
	
	@Given("que o usuario acesse a url para deletar cadastro funcionario")
	public void que_o_usuario_acesse_a_url_para_deletar_cadastro_funcionario() throws IOException {
		CadastroFuncionarioWeb.getBaseURL();
		Connections.getConnection(Serenity.sessionVariableCalled(ChavesSessaoWeb.CADASTRO_FUNCIONARIO).toString());
		String name = readFile.readFile("user");
		actions.clickAndWriter(loginPage.userField, name);
		String password = readFile.readFile("password");
		actions.clickAndWriter(loginPage.passwordField, password);
		actions.clickAndWriter(loginPage.entterButton, null);
	}


}
