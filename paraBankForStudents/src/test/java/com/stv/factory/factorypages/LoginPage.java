package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "Login_EmailAddress")
    private WebElement emailField;

    @FindBy(id = "Login_Password")
    private WebElement passwordField;

    @FindBy(id = "LoginButton")
    private WebElement loginButton;

    @FindBy(css = ".error-message")
    private WebElement errorMessage;

    public LoginPage() {
        super();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean hasErrorMessage() {
        return errorMessage.isDisplayed();
    }
}