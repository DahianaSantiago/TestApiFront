package co.com.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/test.feature",
        glue= "co.com.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)



public class ApiTest {
}
