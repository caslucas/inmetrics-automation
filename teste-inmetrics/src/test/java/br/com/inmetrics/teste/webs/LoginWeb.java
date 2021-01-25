package br.com.inmetrics.teste.webs;

import br.com.inmetrics.teste.enums.ChavesSessaoWeb;
import br.com.inmetrics.teste.util.Properties;
import net.serenitybdd.core.Serenity;

public class LoginWeb {
	
	public static void getBaseURL() {
		String baseUrl = Properties.getPropertiesSystem(Properties.BASE_URL);
		Serenity.setSessionVariable(ChavesSessaoWeb.LOGIN_URL).to(baseUrl);
	}
}
