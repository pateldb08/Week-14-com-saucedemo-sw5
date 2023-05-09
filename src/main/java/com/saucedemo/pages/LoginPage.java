package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

//    By usernameField = By.id("user-name");
//    By passwordField = By.id("password");
//    By loginButton = By.id("login-button");

    @CacheLookup
    @FindBy(id="user-name")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id="password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void enterUserName(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
}
