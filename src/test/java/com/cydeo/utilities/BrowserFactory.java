package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser){

        WebDriver driver = new ChromeDriver();

        if ((System.getProperty("os.name").equals("Windows 10")&&browser.equals("safari")) || (System.getProperty("os.name").equals("Mac")&&browser.equals("edge"))){
            driver = null;
        }

        if (browser.equals("Chrome")){
                WebDriverManager.chromedriver().setup();
                driver =  new ChromeDriver();
        } else if (browser.equals("Firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver =  new FirefoxDriver();
        } else if (browser.equals("Edge")) {
                WebDriverManager.edgedriver().setup();
                driver =  new EdgeDriver();
        } else if(browser.equals("Safari")){
                WebDriverManager.safaridriver().setup();
                driver =  new SafariDriver();
        }

        return driver;
    }
}
