package com.website.JawweyTV.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/website/JawweyTV/tests/jawwySubscription.feature",
        glue = {"com.website.JawweyTV.tests"},
        plugin = {"html:reports/JawwyTV-Website-Report.html"},
        monochrome = true
)
public class jawwySubscriptionRunner extends AbstractTestNGCucumberTests {
}
