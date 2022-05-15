package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @Test
    public void selenium_test(){
        //do browser driver setup
        //open the browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get "https://google.com"
        driver.get("https://google.com");


        //Assert:title is "Google"
    }

}
