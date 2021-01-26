package br.com.inmetrics.main.apis;

import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.Properties;
import net.serenitybdd.core.Serenity;

public class AlterarUsuarioApi {
	public static void alterUser() {
		String alterUser = Properties.getPropertiesSystem(Properties.ALTERAR_USUARIO);
		Serenity.setSessionVariable(ChavesSessaoApi.ALTERAR_USUARIO_API).to(alterUser);
	}

}
