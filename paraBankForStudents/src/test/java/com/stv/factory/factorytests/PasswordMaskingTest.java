package com.stv.factory.factorytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordMaskingTest extends BaseTest {

    @Test
    public void checkPasswordIsHidden() {
        loginPage.typePassword("anypassword123");

        boolean passwordHidden = loginPage.checkPasswordHidden();

        Assert.assertTrue(passwordHidden);
    }
}
