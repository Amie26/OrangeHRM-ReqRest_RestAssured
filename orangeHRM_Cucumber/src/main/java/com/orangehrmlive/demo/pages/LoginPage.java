package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _loginPanel;

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement _userNameField;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement _loginBtn;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _verifyMessage;

public void  verifyLoginPanel (){
    Reporter.log("Verify Login Panel message" + _loginPanel.toString() + "<br>");
    log.info("Verify Login Panel message" + _loginPanel.toString());
     String actual = getTextFromElement(_loginPanel);
     Assert.assertEquals(actual, "LOGIN Panel");
}

public void sendTextToUserNameField(String uName){
    Reporter.log("Send text to User name field " + _userNameField.toString() + "<br");
    log.info("Send text to User name field" + _userNameField.toString());
    clickOnElement(_userNameField);
    sendTextToElement(_userNameField, uName);

}
public void sendTextToPasswordField(String pwd){
    Reporter.log("Send text to password field" + _passwordField.toString() + "<br>");
    log.info("Send text to password field " + _passwordField.toString());
    waitFor(5);
    clickOnElement(_passwordField);
    sendTextToElement(_passwordField,pwd);

}

public void clickOnLoginBtn (){
    Reporter.log("Click on Login Button" + _loginBtn.toString() + "<br>");
    log.info("Click on Login Button" + _loginBtn.toString());
    clickOnElement(_loginBtn);
}

public void verifyMessage (){
    String actual = getTextFromElement(_verifyMessage);
    Assert.assertEquals(actual, "Welcome Admin");
}
}
