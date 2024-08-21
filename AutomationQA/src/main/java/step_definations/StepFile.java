package  step_definations;

import application.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class StepFile {
    OrangeHRM app;
//    ApiApplication api;

    @Given("^User have open the browser$")
    public void openBrowser() {
        app = new OrangeHRM();
        app.openBrowser();
    }

    @When("^User opens the OrangeHrm open source page$")
    public void goToOrangeHRM() {
        app.goToOrangeHRM();
    }

    @And("^User enters valid username (.*) and password (.*)$")
    public void enterCredential(String userName, String password) {
        app.enterCredential(userName, password);
    }

    @And("^User clicks the login button$")
    public void clickLoginButton() {
        app.clickLoginButton();
    }

    @Then("^User should navigate to dashboard$")
    public void dashboardOpen() {
        app.dashboardOpen();
    }

    @And("^User enters (.*) as username and (.*) as password$")
    public void enterUsernamePass(String username, String password) {
        app.enterUsernamePass(username, password);
    }

    @Then("^User should see (.*) error message1$")
    public void errorMessage1(String expectedErrorMessage) {
        app.errorMessage1(expectedErrorMessage);

    }
    @Then("^User should see (.*) error message2$")
    public void errorMessage2(String expectedErrorMessage) {
        app.errorMessage2(expectedErrorMessage);
    }
}
