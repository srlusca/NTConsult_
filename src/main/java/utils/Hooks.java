package utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.io.IOException;


public class Hooks extends ConfigWeb {

    @Before
    public void initChrome(Scenario scenario) throws IOException {
        if (openChrome().getCurrentUrl().contains("data:,")) {
            String url = ArchiveUtils.getProperties("url.blog.agi");
            getDriver().get(url);
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        closeChrome();
    }
}
