package br.com.inmetrics.main.webs;

import br.com.inmetrics.main.enums.ChavesSessaoWeb;
import br.com.inmetrics.main.util.Properties;
import net.serenitybdd.core.Serenity;


public class CadastroUsuarioWeb {
	
	public static void getBaseURL() {
		String baseUrl = Properties.getPropertiesSystem(Properties.BASE_URL);
		Serenity.setSessionVariable(ChavesSessaoWeb.CADASTRO_USUARIO_URL).to(baseUrl);
	}
}
