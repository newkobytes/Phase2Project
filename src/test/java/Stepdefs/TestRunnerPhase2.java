package Stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)

	@CucumberOptions(
			monochrome=true,
			strict=true,
			plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
			features = "src/test/java/featuresphase2", 
			glue = "Stepdefs",
			tags = {"@WIP or @sanity"}
				)
		
	public class TestRunnerPhase2 {

	}

