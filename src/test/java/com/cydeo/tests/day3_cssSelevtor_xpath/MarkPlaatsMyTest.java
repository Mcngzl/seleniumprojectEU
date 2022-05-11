package com.cydeo.tests.day3_cssSelevtor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarkPlaatsMyTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.marktplaats.nl/");

       // WebElement acceptButton = driver.findElement(By.cssSelector("button [id='gdpr-consent-banner-accept-button'"));

        Thread.sleep(2000);

        WebElement acceptbutton = driver.findElement(By.cssSelector("button[class='gdpr-consent-button mp-Button mp-Button--primary mp-Button--lg mp-width-full']"));
        acceptbutton.click();

        WebElement allecatagory = driver.findElement(By.cssSelector("span[class='hz-CategoryMenuBar-expandToggleLabel']"));
        allecatagory.click();
        Thread.sleep(2000);



        String expectedallecatagoryButtonText ="Alle categorieën";
        String actualCatagoryButtonText =allecatagory.getText();

        if (actualCatagoryButtonText.equals(expectedallecatagoryButtonText)){
            System.out.println("actualCatagoryButtonText = " + actualCatagoryButtonText);
            System.out.println("opearation accomplished");
        }else {
            System.out.println("Operation Failed");
        }

        WebElement auto = driver.findElement(By.cssSelector("a[class='hz-CategoryMenuBarItem-link']"));
        auto.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();

    }

}
