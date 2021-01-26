package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = { "./src/test/resources/features/api" }, 
				glue = { "br.com.inmetrics.main.apisteps.step"}, 
				plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-reports" }, 
				//tags= "@alterarCadastro",
				monochrome = true)

public class RunCucumberTestApi {

}