package eliezerTest.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "app/src/test/resources/Features",
glue = "app/src/test/java/eliezerTest/steps"



)

public class runner{

    
}