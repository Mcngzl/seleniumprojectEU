package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropdown_task5() throws InterruptedException {


        //we located the dropdown and it is ready to use
        Select stateDropdown =new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionTExt ="California";
        String actualOptionText =stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionTExt);

    }

    @Test
    public void dropDownTask6(){

        Select yearDropDown =new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropDown =new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropDown =new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        yearDropDown.selectByVisibleText("1923");

        //Select month using : value attribute
        monthDropDown.selectByValue("11");


        //Select day using : index number
        dayDropDown.selectByIndex(0);

        //creating expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser

        String actualYear =yearDropDown.getFirstSelectedOption().getText();
        String actualmonth =monthDropDown.getFirstSelectedOption().getText();
        String actualDay =dayDropDown.getFirstSelectedOption().getText();

        //create assertions

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualmonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);


    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
