package br.com.inmetrics.main.util;

import br.com.inmetrics.main.enums.ChavesSessaoApi;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

public class RestAPIS {
	
	public Response getListAllUser(String url) {
		Response response = SerenityRest.given().auth()
				  .basic("inmetrics", "automacao")
				  .when()
				  .get(url);
		return response;
	}
	
	public Response getUserId(String url, int id) {
		Response response = SerenityRest.given().auth()
				  .basic("inmetrics", "automacao")
				  .when()
				  .get(url + id);
		return response;
	}
	
	public Response registerEmployee(String url) {
		Response response = SerenityRest.given().auth()
				  .basic("inmetrics", "automacao")
				  .contentType(ContentType.JSON)
				  .body("{\r\n"
				  		+ "  \"admissao\": \"01/01/1990\",\r\n"
				  		+ "  \"cargo\": \"Assistente\",\r\n"
				  		+ "  \"comissao\": \"1.000,00\",\r\n"
				  		+ "  \"cpf\": \"499.706.208-19\",\r\n"
				  		+ "  \"departamentoId\": 2,\r\n"
				  		+ "  \"nome\": \"Teste\",\r\n"
				  		+ "  \"salario\": \"7.000,00\",\r\n"
				  		+ "  \"sexo\": \"m\",\r\n"
				  		+ "  \"tipoContratacao\": \"clt\"\r\n"
				  		+ "}")
				  .post(url);
		return response;
	}
	
	GenerateNames gen = new GenerateNames();
	
	public Response alterUser(String url, int id) {
		String name = gen.generateNames();
		Response response = SerenityRest.given().auth()
				  .basic("inmetrics", "automacao")
				  .contentType(ContentType.JSON)
				  .body("{\r\n"
				  		+ "  \"admissao\": \"01/01/1990\",\r\n"
				  		+ "  \"cargo\": \"Assistente\",\r\n"
				  		+ "  \"comissao\": \"1.000,00\",\r\n"
				  		+ "  \"cpf\": \"499.706.208-19\",\r\n"
				  		+ "  \"departamentoId\": 2,\r\n"
				  		+ "  \"nome\":" + "\""+ name +"\""+ ",\r\n"
				  		+ "  \"salario\": \"7.000,00\",\r\n"
				  		+ "  \"sexo\": \"m\",\r\n"
				  		+ "  \"tipoContratacao\": \"clt\"\r\n"
				  		+ "}")
				  .put(url+id);
		Serenity.setSessionVariable(ChavesSessaoApi.NAME).to(name);
		return response;
	}
}
