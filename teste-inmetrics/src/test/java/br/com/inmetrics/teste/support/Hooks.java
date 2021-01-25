package br.com.inmetrics.teste.support;

import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;
import br.com.inmetrics.teste.enums.ChavesSessaoWeb;
import br.com.inmetrics.teste.util.Connections;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;

public class Hooks extends Connections {
	
	@Before
    public void beforeScenario(){
        //System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario() throws IOException{
		JSONObject json = new JSONObject();
		try {
				json.put("user", Serenity.sessionVariableCalled(ChavesSessaoWeb.USER_NAME).toString());
				json.put("password", Serenity.sessionVariableCalled(ChavesSessaoWeb.USER_PASSWORD).toString());
				FileOutputStream fos = new FileOutputStream("src/test/resources/user.json");
				fos.write(json.toString().getBytes());
				fos.flush();
				fos.close();
				driver.close();
			
		} catch (Exception e) {
			driver.close();
		}
		
	}
}