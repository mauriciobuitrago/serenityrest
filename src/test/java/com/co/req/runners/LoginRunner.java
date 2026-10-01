package com.co.req.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/resources/features/login.feature",
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                glue = "com.co.req.stepsdefinitions"
        )
public class LoginRunner {
}
