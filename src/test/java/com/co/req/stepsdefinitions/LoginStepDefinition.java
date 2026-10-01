package com.co.req.stepsdefinitions;

import com.co.req.tasks.PostLogin;
import com.co.req.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class LoginStepDefinition {

    Actor Mauro = Actor.named("Mauro");

    @Given("he user have the ability to access the api")
    public void heUserHaveTheAbilityToAccessTheApi() {
        Mauro.whoCan(CallAnApi.at(Constants.URL));
    }

    @When("he send request to the login api")
    public void heSendRequestToTheLoginApi() {
    Mauro.attemptsTo(PostLogin.withTheData());

    }
    @Then("he could see the response with status code {int}")
    public void heCouldSeeTheResponseWithStatusCode(Integer int1) {

    }

}
