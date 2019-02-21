package com.qa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:feature" }, plugin = { "pretty" }, glue = {"com.qa.cucumber"}, strict = true)

public class Testrunner {

}