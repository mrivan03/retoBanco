package co.com.bancolombia.certification.technical_challenge.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature", glue = {
		"co.com.bancolombia.certification.technical_challenge.step_definitions" }, snippets = SnippetType.CAMELCASE)
public class RegisterRunner {

}
