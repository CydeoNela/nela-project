package com.nela.step_definitions;

import com.nela.utilities.BrowserUtils;
import com.nela.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed - it will take a screenshot
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }


}
