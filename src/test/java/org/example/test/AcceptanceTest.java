package org.example.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "cases",monochrome = true,snippets = CucumberOptions.SnippetType.CAMELCASE,
glue = {"org.example.test"})
public class AcceptanceTest {




}
