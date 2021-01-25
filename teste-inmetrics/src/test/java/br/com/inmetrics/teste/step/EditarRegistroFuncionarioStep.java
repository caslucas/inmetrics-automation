package br.com.inmetrics.teste.step;

import br.com.inmetrics.teste.pageobject.EditarRegistroFuncionarioPageObject;
import br.com.inmetrics.teste.util.GenerateNames;
import br.com.inmetrics.teste.util.ReadFile;
import br.com.inmetrics.teste.util.WebElementsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditarRegistroFuncionarioStep {
	
	public WebElementsActions actions					 			= new WebElementsActions();
	public EditarRegistroFuncionarioPageObject editar 				= new EditarRegistroFuncionarioPageObject();
	public GenerateNames genNames 									= new GenerateNames();
	public ReadFile readFile 										= new ReadFile();
	

	@When("for feito a pesquisa pelo cpf")
	public void for_feito_a_pesquisa_pelo_cpf() {
		actions.clickAndWriter(editar.searchField, "499.706.208-19");
	}

	@And("informar novos dados do funcionario")
	public void informar_novos_dados_do_funcionario() {
		actions.clickAndWriter(editar.editButton, null);
		actions.clear(editar.office);
		actions.clickAndWriter(editar.office, "Automatizador de Testes");
		actions.clear(editar.money);
		actions.clickAndWriter(editar.money, "800000");
	}

	@Then("o usuario devera clicar no botao de envio")
	public void o_usuario_devera_clicar_no_botao_de_envio() {
		actions.clickAndWriter(editar.registerFunctionary, null);
	}
	
	@And("validar se a edicao foi concluida com sucesso")
	public void validar_se_a_edicao_foi_concluida_com_sucesso() {
		actions.clickAndWriter(editar.popUpSucess, null);
	}
}
