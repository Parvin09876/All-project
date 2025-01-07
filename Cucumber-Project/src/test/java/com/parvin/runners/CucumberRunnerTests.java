package com.parvin.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/Login.feature"},
        glue ={"com.parvin.definition"}
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
