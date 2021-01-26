package br.com.inmetrics.main.step;

import br.com.inmetrics.main.pageobject.DeletarRegistroPageObject;
import br.com.inmetrics.main.util.GenerateNames;
import br.com.inmetrics.main.util.WebElementsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeletarRegistroStep {
	
	public WebElementsActions actions					 	= new WebElementsActions();
	public DeletarRegistroPageObject deleteRegistro			= new DeletarRegistroPageObject();
	public GenerateNames genNames 							= new GenerateNames();

	@When("for feito a pesquisa pelo cpf cadastrado")
	public void for_feito_a_pesquisa_pelo_cpf_cadastrado() {
		actions.clickAndWriter(deleteRegistro.searchField, "499.706.208-19");
	}

	@Then("o usuario devera clicar no botao de deletar")
	public void o_usuario_devera_clicar_no_botao_de_deletar() {
		actions.clickAndWriter(deleteRegistro.deleteButton, null);
	}

	@And("validar se o registro foi deletado com sucesso")
	public void validar_se_o_registro_foi_deletado_com_sucesso() {
		actions.clickAndWriter(deleteRegistro.popUpSucess, null);
	}

}
