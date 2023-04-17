package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

public class GoogleStepDefinitions {


    @Given("go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(url);
    }

    @Then("close the application")
    public void close_the_application() throws InterruptedException {
        Driver.closeDriver();

    }


}
