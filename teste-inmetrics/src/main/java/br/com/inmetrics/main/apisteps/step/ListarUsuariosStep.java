package br.com.inmetrics.main.apisteps.step;

import static org.junit.Assert.assertEquals;
import br.com.inmetrics.main.apis.ListarUsuarios;
import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.RestAPIS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.*;

public class ListarUsuariosStep {
	
	public RestAPIS rest = new RestAPIS();
	public Response response;
	
	@Given("que seja feita uma requisicao para listar usuarios")
	public void que_seja_feita_uma_requisicao_para_listar_usuarios() {
		ListarUsuarios.getApiUsersList();
		response = rest.getListAllUser(Serenity.sessionVariableCalled(ChavesSessaoApi.LISTAR_USUARIOS_API).toString());
	}

	@When("o sistema obter a resposa da requisicao devera validar o status")
	public void o_sistema_obter_a_resposa_da_requisicao_devera_validar_o_status() {
		assertEquals(response.statusCode(), 200);
	}

	@Then("validar o response retornado")
	public void validar_o_response_retornado() {
		SerenityRest.then().body("empregadoId", hasSize(greaterThan(0)));
	}

}
