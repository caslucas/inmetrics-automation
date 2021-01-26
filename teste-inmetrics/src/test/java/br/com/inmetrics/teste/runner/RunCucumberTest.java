 package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = { "./src/test/resources/features/web", "./src/test/resources/features/api"}, 
				glue 	  = {"br.com.inmetrics.main.step", "br.com.inmetrics.main.apisteps.step" ,"br.com.inmetrics.teste.support"},
				plugin = {"json:target/cucumber.json","pretty", "html:target/cucumber-reports"},
				monochrome = true)
				 

public class RunCucumberTest {

}