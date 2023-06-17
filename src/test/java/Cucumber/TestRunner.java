package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Dell\\Desktop\\Batch3Selenium\\src\\test\\java\\Cucumber\\login.feature",
glue = "Cucumber", plugin = { "pretty", "html:target/TC1.html"})

public class TestRunner {

}
