package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun =false,
        tags = "@dashboard"
        // tags = "@wip"
        // tags = "@wip and @SDET"
        // tags = "@wip or @SDET"
        //tags = "@wip and not @SDET"
        //tags = "@Login and @SDET"

)
public class CukesRunner {
}
