package com.orangehrmlive.demo.StepDefs;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.LogoutPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("^I am on orangehrmlive homepage$")
    public void iAmOnOrangehrmliveHomepage() {
        loginPage.verifyLoginPanel();
    }

    @And("^I enter user name \"([^\"]*)\"$")
    public void iEnterUserName(String uName)  {
       loginPage.sendTextToUserNameField(uName);
    }

    @And("^I enter  password \"([^\"]*)\"$")
    public void iEnterPassword(String pwd) {
      loginPage.sendTextToPasswordField(pwd);
    }

    @When("^I click on Login Button$")
    public void iClickOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }

    @Then("^I can Login Successfully$")
    public void iCanLoginSuccessfully() {
        loginPage.verifyMessage();
    }

    @And("^I click on welcome user link$")
    public void iClickOnWelcomeUserLink() {
        logoutPage.clickOnUserLink();
    }

    @When("^I click on Logout page$")
    public void iClickOnLogoutPage() {
        logoutPage.clickOnLogoutLink();
    }

    @Then("^I Logout successfully$")
    public void iLogoutSuccessfully() {
        logoutPage.verifyLogout();
    }
}
