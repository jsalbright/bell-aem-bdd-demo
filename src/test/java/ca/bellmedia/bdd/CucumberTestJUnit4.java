package ca.bellmedia.bdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin      = { "pretty", "html:target/cucumber-reports/index.html", // locations of reports
                        "json:target/cucumber-reports/cucumber.json" },
        features    = { "classpath:features" },                             // location of feature files
        glue        = { "ca.bellmedia.bdd" })                               // location of step-definitions
public class CucumberTestJUnit4 {

}