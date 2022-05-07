package com.cydeo.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Cydeo practice tool verifications
        //        //1. Open Chrome browser
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2 go to :;https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");

        //3 Click to A/B Testing from top of the list
        //Thread.sleep(4000);
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink =driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();


        //4.Verify the title is:
        // Expected: No A/B Test
        String expectedTitle ="No A/B Test";
        String actualTitle =driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED!!!");
        }


        //5- go back to home by using the  .back();
        driver.navigate().back();



        //6-Verify title equals:
        //expected title :Practice

        String expectedTitle2 ="Practice";
        String actualTitle2 =driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Verification title2 PASSED");
        }else{
            System.out.println("Verification title2 FAILED");
        }

    }

}
