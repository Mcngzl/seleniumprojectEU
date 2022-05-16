package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //open the Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDownTEst(){

        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id=\"dropdown\"]")));

        WebElement currentlySelectedOption =simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropDownText = currentlySelectedOption.getText();
        String expectedSimpleDropDownText ="Please select an option";

        System.out.println(actualSimpleDropDownText);

        Assert.assertEquals(actualSimpleDropDownText,expectedSimpleDropDownText);

        //4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id=\"state\"]")));

        String expectedStateDropdownText ="Select a State";
        String actualStateDropdownText =stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedStateDropdownText,actualStateDropdownText);


        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "Select a State");



    }






}
