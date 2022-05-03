package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1 -set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of the selenium webdriver
        // this is the line opening an empty browser
        WebDriver driver =new ChromeDriver();


        //3- Go to "https://ww.tesla.com"
        driver.get("https://www.tesla.com");


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();


        //stop code execution for 3 seconds
        Thread.sleep(3000);


        // use selenium to navigate forward
        driver.navigate().forward();


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);















    }
}
