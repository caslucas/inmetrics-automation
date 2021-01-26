package br.com.inmetrics.main.util;

import net.serenitybdd.core.environment.ConfiguredEnvironment;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class Properties {
	
	public static final String BASE_URL = "web.base.url";
	public static final String WEBDRIVER_PROPERTIE = "webdriverconf.propertie";
	public static final String WEBDRIVER_PATH = "webdriverconf.path";
	public static final String LISTAR_USUARIOS_API = "api.listar.usuarios";
	public static final String LISTAR_USUARIO_ID = "api.listar.usuario.cadastrado.id";
	public static final String CADASTRO_USUARIO = "api.cadastro.usuario";
	public static final String ALTERAR_USUARIO = "api.alterar.usuario";
	
	
	
	public static String getPropertiesSystem(String key) {
		EnvironmentVariables environmentVariables = ConfiguredEnvironment.getEnvironmentVariables();
		return EnvironmentSpecificConfiguration.from(environmentVariables)
				.getProperty(key);
	}

}
