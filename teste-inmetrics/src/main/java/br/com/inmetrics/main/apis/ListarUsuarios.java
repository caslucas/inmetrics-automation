package br.com.inmetrics.main.apis;

import br.com.inmetrics.main.enums.ChavesSessaoApi;
import br.com.inmetrics.main.util.Properties;
import net.serenitybdd.core.Serenity;

public class ListarUsuarios {
	
	public static void getApiUsersList() {
		String listUsers = Properties.getPropertiesSystem(Properties.LISTAR_USUARIOS_API);
		Serenity.setSessionVariable(ChavesSessaoApi.LISTAR_USUARIOS_API).to(listUsers);
	}
}
