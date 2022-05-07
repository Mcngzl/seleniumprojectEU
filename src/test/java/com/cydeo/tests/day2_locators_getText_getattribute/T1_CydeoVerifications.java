package com.cydeo.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    //in this class we want to solve day2 t1

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3.vrify URL contains
        //Expected : Cydeo

        String expectedURl ="cydeo";
        String actualURl = driver.getCurrentUrl();
        if (actualURl.contains(expectedURl)){
            System.out.println("URL verificcation PASSED");
        }else {
            System.out.println("URL verifaication FAILED");
        }

        //4. Verify Title
        //expected title: practice
        String expectedTitle ="Practice";
        String actualTitle =driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        driver.close();




    }
}
