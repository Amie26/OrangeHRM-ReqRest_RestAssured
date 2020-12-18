package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LogoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _homePageVerify;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _userLink;


    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logoutLink;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _verifyLogout;

    public void verifyHomePage(){
        Reporter.log("Verify user is on Home Page " + _homePageVerify.toString() + "<br>");
        log.info("Verify user is on Home Page " + _homePageVerify.toString());
        String actual = getTextFromElement(_homePageVerify);
        Assert.assertEquals(actual,"Welcome Admin");
    }

    public void clickOnUserLink(){
        Reporter.log("Clicks on User Link " + _userLink.toString() + "<br>");
        log.info("Clicks on User Link " + _userLink.toString());
        clickOnElement(_userLink);
    }
    public void clickOnLogoutLink(){
        Reporter.log("Click on Logout Link " + _logoutLink.toString() + "<br>");
        log.info("Clicks on Log out Link " + _logoutLink.toString());
        clickOnElement(_logoutLink);
    }

    public void verifyLogout (){
        Reporter.log("Verify user has Logged out " + _verifyLogout.toString() + "<br>");
        log.info("Verify user has Loggged out " + _verifyLogout.toString());
        String actual = getTextFromElement(_verifyLogout);
        Assert.assertEquals(actual,"LOGIN Panel");
    }



}
