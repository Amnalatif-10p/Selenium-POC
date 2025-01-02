package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"Admin", "admin123"},    // Valid credentials
                {"InvalidUser", "admin123"}, // Invalid username
                {"Admin", "InvalidPass"}  // Invalid password
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();


        if (username.equals("Admin") && password.equals("admin123")) {
            Assert.assertTrue(loginPage.isDashboardDisplayed(), "Dashboard is not displayed for valid credentials");
        } else {
            Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message is not displayed for invalid credentials");
        }

    }
}
