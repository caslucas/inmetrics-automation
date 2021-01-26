package br.com.inmetrics.main.apisteps.step;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import br.com.inmetrics.main.apis.AlterarUsuarioApi;
import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.RestAPIS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

public class AlterarUsuarioStep {
	
	public RestAPIS rest = new RestAPIS();
	public Response response;
	
	@Given("que seja feita uma requisicao para alterar usuarios")
	public void que_seja_feita_uma_requisicao_para_alterar_usuarios() {
		AlterarUsuarioApi.alterUser();
		response = rest.alterUser(Serenity.sessionVariableCalled(ChavesSessaoApi.ALTERAR_USUARIO_API).toString(), 507);
	}

	@When("o sistema obter a resposta devera validar o status code")
	public void o_sistema_obter_a_resposta_devera_validar_o_status_code() {
		assertEquals(response.statusCode(), 202);
	}

	@Then("validar o response retornado da alteracao")
	public void validar_o_response_retornado_da_alteracao() {
		SerenityRest.then().body("nome", equalTo(Serenity.sessionVariableCalled(ChavesSessaoApi.NAME).toString()));
	}

}
