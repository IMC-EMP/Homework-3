package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFactory {

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    public static LoginPage openLoginPage() {
        WebDriver driver = createDriver();
        driver.get("https://www.wiggle.com/login");
        return new LoginPage(driver);
    }
}
