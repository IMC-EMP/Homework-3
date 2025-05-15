package com.stv.factory.factorytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginButtonDisabled {

    @Test
    public void checkLoginButtonDisabled() {
        LoginPage loginPage = new LoginPage();

        loginPage.clickLogin();

        String actualError = loginPage.getErrorMessage();
        Assert.assertEquals(actualError, "Please provide a password");
    }
}
