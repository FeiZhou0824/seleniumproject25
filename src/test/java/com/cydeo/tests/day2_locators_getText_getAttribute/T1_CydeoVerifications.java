package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications

        // do setup for browser driver
        WebDriverManager .chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();


        //        2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3. Verify URL contains
        //    Expected: cydeo

        String currentUrl = driver.getCurrentUrl();
        String expected = "cydeo";

        if(currentUrl.contains(expected)){
            System.out.println("URL contains \"cydeo\". Verification PASSED");
        }else{
            System.out.println("URL does not contains \"cydeo\". Verification FAILED");
        }

        //4. Verify title:
        //       Expected: Practice

        String currentTitle = driver.getTitle();
        String expectedTile ="Practice";

        if(currentTitle.equals(expectedTile)){
            System.out.println("Title is as expected. Verification PASSED");
        } else{
        System.out.println("Title is NOT as expected. Verification FAILED");
    }

        driver.close();










  }
}
