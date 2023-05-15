package com.website.StcTV.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/website/StcTV/tests/STCSubscription.feature",
        glue = {"com.website.StcTV.tests"},
        plugin = {"html:reports/StcTV-Website-Report.html"},
        monochrome = true
)
public class STCSubscriptionRunner extends AbstractTestNGCucumberTests {
}
