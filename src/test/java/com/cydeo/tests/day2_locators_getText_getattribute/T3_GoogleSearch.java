package com.cydeo.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: Cydeo practice tool verifications
        //        //1. Open Chrome browser
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2-go to google
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        WebElement acceptButton =driver.findElement(By.className("tHlp8d"));
        //System.out.println(acceptButton.getText());
        //acceptButton.click();

        //3-Write "apple" in search box
        //4.PRESS enter using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }








    }

}
