package com.vytrack.tests.login_navigation;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTests  extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login(){
        String userName = ConfigurationReader.getProperty("stormanagerusername");
        String password = ConfigurationReader.getProperty("stormanagerpassword");
        loginPage.login(userName, password);

    }
}
