package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class LoginSteps {

    WebDriver driver = DriverManager.getDriver();

    @Given("user opens the application")
    public void openApp() {
        driver.get("https://engagebay.com");
    }

    @When("user enters credentials")
    public void enterCredentials() {
        System.out.println("Entering valid credentials");
    }

    @When("user enters invalid credentials")
    public void enterInvalidCredentials() {
        System.out.println("Entering invalid credentials");
    }

    @Then("user should see homepage")
    public void verifyHome() {
        System.out.println("Homepage displayed");
    }

    @Then("error message should display")
    public void verifyError() {
        System.out.println("Error displayed");
    }
}