package br.com.inmetrics.main.step;

import java.io.IOException;

import br.com.inmetrics.main.pageobject.CadastroFuncionarioPageObject;
import br.com.inmetrics.main.util.GenerateNames;
import br.com.inmetrics.main.util.ReadFile;
import br.com.inmetrics.main.util.WebElementsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroZFuncionarioStep {
	
	public WebElementsActions actions					 	= new WebElementsActions();
	public CadastroFuncionarioPageObject cadastroPage 		= new CadastroFuncionarioPageObject();
	public GenerateNames genNames 							= new GenerateNames();
	public ReadFile readFile 								= new ReadFile();
	
	

	@When("o usuario clicar no botao para cadastrar funcionario")
	public void o_usuario_clicar_no_botao_para_cadastrar_funcionario() {
		actions.clickAndWriter(cadastroPage.newEmployeeButton, null);
	}
	

	@And("informar os dados do funcionario")
	public void informar_os_dados_do_funcionario() throws IOException {
		String name = readFile.readFile("user");
		actions.clickAndWriter(cadastroPage.inputName, name);
		actions.clickAndWriter(cadastroPage.inputCpf, "499.706.208-19");
		actions.clickAndWriter(cadastroPage.adimission, "04/02/1997");
		actions.clickAndWriter(cadastroPage.boxSelect, "Masculino");
		actions.clickAndWriter(cadastroPage.office, "Analista de Testes Automatizados");
		actions.clickAndWriter(cadastroPage.money, "700000");
	    actions.clickAndWriter(cadastroPage.officeType, null);
	}

	@Then("o usuario devera clicar no botao enviar")
	public void o_usuario_devera_clicar_no_botao_enviar() {
	    actions.clickAndWriter(cadastroPage.registerFunctionary, null);
	}

	@And("validar se o usuario foi cadastrado com sucesso")
	public void validar_se_o_usuario_foi_cadastrado_com_sucesso() {
		actions.clickAndWriter(cadastroPage.popUpSucess, null);
	}

}
