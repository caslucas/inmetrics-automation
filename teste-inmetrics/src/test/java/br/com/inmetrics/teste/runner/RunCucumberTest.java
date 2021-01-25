 package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = { "./src/test/resources/features" }, 
				glue 	  = {"br.com.inmetrics.teste.step", "br.com.inmetrics.teste.support"})
				 

public class RunCucumberTest {

}