package com.nela.step_definitions;

import com.nela.pages.BasePage;
import com.nela.utilities.BrowserUtils;
import com.nela.utilities.ConfigurationReader;
import com.nela.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class CloudBoldSearch {
    BasePage basePage = new BasePage();
    @Given("user is on CLoudBold Software home page")
    public void user_is_on_c_loud_bold_software_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @When("user searches Calendar")
    public void user_searches_calendar() {
    basePage.searchIcon.click();
    basePage.searchBar.sendKeys("calendar"+ Keys.ENTER);

    }
    @Then("user should see Search Results Calendar")
    public void user_should_see_search_results_calendar() {
        BrowserUtils.verifyTitle("https://www.cloudbolt.io/?s=calendar");

    }

}
