package com.vytrack.utilities;

import javafx.css.CssMetaData;
import javafx.css.Styleable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.Configuration;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Actions action;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver(ConfigurationReader.getProperty("browser"));
        action = new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(Integer.parseInt(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigurationReader.getProperty("implicitwait")),TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }
}
