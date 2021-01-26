package br.com.inmetrics.main.apis;

import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.Properties;
import net.serenitybdd.core.Serenity;

public class CadastrarUsuarioEmpregadoApi {
	public static void getApiRegisterUserEmployee() {
		String registerUser = Properties.getPropertiesSystem(Properties.CADASTRO_USUARIO);
		Serenity.setSessionVariable(ChavesSessaoApi.CADASTRO_USUARIO_EMPREGADO_API).to(registerUser);
	}

}
