package com.devEx.step_definitions;

import com.devEx.pages.DashboardPage;
import com.devEx.pages.LoginPage;
import com.devEx.utilities.ConfigurationReader;
import com.devEx.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user logs in using {string} and {string} credentials")
    public void theUserLogsInUsingAndCredentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }



}
