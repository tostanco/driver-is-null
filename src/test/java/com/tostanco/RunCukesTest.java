package com.tostanco;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// import cucumber.api.CucumberOptions;
// import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/com/tostanco", 
glue = { "com.tostanco.stepDefs" }, 
monochrome = true,
dryRun = false,
tags = ("@SmokeTest"))
public class RunCukesTest {
}
