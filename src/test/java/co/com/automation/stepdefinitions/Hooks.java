package co.com.automation.stepdefinitions;


import io.cucumber.java.Before;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {

    EnvironmentVariables environmentVariable;
    String urlBase;

@Before(order = 0)
    public void configBaseUrl(){
    final String URLPATH = "baseurl";
    environmentVariable = Injectors.getInjector().getInstance(EnvironmentVariables.class);
    urlBase = EnvironmentSpecificConfiguration.from(environmentVariable).getProperty(URLPATH);
}

@Before(order = 1)
    public void actorSettings(){
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("Actor").whoCan(CallAnApi.at(urlBase));

}



}
