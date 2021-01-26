package br.com.inmetrics.main.apisteps.step;


import static org.junit.Assert.assertEquals;
import br.com.inmetrics.main.apis.ListarUsuarioCadastradoIdApi;
import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.RestAPIS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.*;

public class ListarUsuarioCadastradoIdStep {
	
	public RestAPIS rest = new RestAPIS();
	public Response response;
	
	@Given("que seja feita uma requisicao para listar usuarios pelo id")
	public void que_seja_feita_uma_requisicao_para_listar_usuarios_pelo_id() {
		ListarUsuarioCadastradoIdApi.getApiUsersRegisterId();
		response = rest.getUserId(Serenity.sessionVariableCalled(ChavesSessaoApi.LISTAR_USUARIO_CADASTRADO_ID).toString(), 3);
	}

	@When("o sistema obter a resposta da requisicao devera validar o status")
	public void o_sistema_obter_a_resposta_da_requisicao_devera_validar_o_status() {
		assertEquals(response.statusCode(), 202);
	}

	@Then("validar o response retornado do cadastro")
	public void validar_o_response_retornado_do_cadastro() {
		SerenityRest.then().body("empregadoId", equalTo(3));
	}

}
