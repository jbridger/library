package com.jwhbridger.library.glue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}
        ,features = "src/test/resources"
        , tags = {"@group1"}
)
public class Group1Tests {
}
