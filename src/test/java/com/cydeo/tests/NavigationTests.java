package com.cydeo.tests;

import com.cydeo.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import static com.cydeo.utilities.BrowserFactory.*;

public class NavigationTests {
    public static void main(String[] args) {


        WebDriver driver = getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String actualTitle1 = driver.getTitle();
        driver.get("https://etsy.com");
        String actualTitle2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), actualTitle1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), actualTitle2);
        driver.close();

        driver = getDriver("Edge");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        actualTitle1 = driver.getTitle();
        driver.get("https://etsy.com");
        actualTitle2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), actualTitle1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), actualTitle2);
        driver.close();

        driver = getDriver("Firefox");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        actualTitle1 = driver.getTitle();
        driver.get("https://etsy.com");
        actualTitle2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), actualTitle1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), actualTitle2);
        driver.close();

    }

}
