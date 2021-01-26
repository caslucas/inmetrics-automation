package br.com.inmetrics.main.apis;

import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.Properties;
import net.serenitybdd.core.Serenity;

public class ListarUsuarioCadastradoIdApi {
	public static void getApiUsersRegisterId() {
		String listUserId = Properties.getPropertiesSystem(Properties.LISTAR_USUARIO_ID);
		Serenity.setSessionVariable(ChavesSessaoApi.LISTAR_USUARIO_CADASTRADO_ID).to(listUserId);
	}

}
