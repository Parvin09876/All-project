package com.parvin.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/LoginPage.feature"},
        glue = {"com.parvin.definition"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
