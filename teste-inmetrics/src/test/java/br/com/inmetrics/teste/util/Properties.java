package br.com.inmetrics.teste.util;

import net.serenitybdd.core.environment.ConfiguredEnvironment;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class Properties {
	
	public static final String BASE_URL = "web.base.url";
	public static final String WEBDRIVER_PROPERTIE = "webdriverconf.propertie";
	public static final String WEBDRIVER_PATH = "webdriverconf.path";
	
	
	public static String getPropertiesSystem(String key) {
		EnvironmentVariables environmentVariables = ConfiguredEnvironment.getEnvironmentVariables();
		return EnvironmentSpecificConfiguration.from(environmentVariables)
				.getProperty(key);
	}

}
