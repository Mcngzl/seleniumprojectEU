package com.cydeo.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {

        /*C #4: Library verifications
        1. Open Chrome browser
        2. Go to http://library2.cybertekschool.com/login.html
        3. Enter username: “incorrect@email.com”
        4. Enter password: “incorrect password”
        5. Verify: visually “Sorry, Wrong Email or Password”
        displayed

         */
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2- go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3- enter username:"incorrect@email.com"
        WebElement userNameInput =driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");


        //4-enter password :"incorrect password"
        WebElement pasword = driver.findElement(By.id("inputPassword"));
        pasword.sendKeys("incorrect password");

        //5-clik to sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6




    }
}
