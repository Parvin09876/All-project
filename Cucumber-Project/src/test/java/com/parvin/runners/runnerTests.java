package com.parvin.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/Login2ndPage.feature"},
        glue = {"com.parvin.MultipleLogin"}
)

public class runnerTests extends AbstractTestNGCucumberTests {
}
