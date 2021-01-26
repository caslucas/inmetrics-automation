package br.com.inmetrics.main.apisteps.step;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import br.com.inmetrics.main.apis.CadastrarUsuarioEmpregadoApi;
import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.RestAPIS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

public class CadastrarUsuarioEmpregadoStep {
	
	public RestAPIS rest = new RestAPIS();
	public Response response;

	@Given("que seja feita uma requisicao para cadastrar usuarios")
	public void que_seja_feita_uma_requisicao_para_cadastrar_usuarios() {
		CadastrarUsuarioEmpregadoApi.getApiRegisterUserEmployee();
		response = rest.registerEmployee(Serenity.sessionVariableCalled(ChavesSessaoApi.CADASTRO_USUARIO_EMPREGADO_API).toString());
	}

	@When("o sistema obter a resposta da requisicao devera validar o status code")
	public void o_sistema_obter_a_resposta_da_requisicao_devera_validar_o_status_code() {
		assertEquals(response.statusCode(), 202);
	}

	@Then("validar o response retornado do cadastro empregado")
	public void validar_o_response_retornado_do_cadastro_empregado() {
		SerenityRest.then().body("nome", equalTo("Teste"));
	}

}
