package com.cydeo.tests.homeWork.day4_HomeWork;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_XpathLocatorPractice {

    @Test
    public void xpathLocatorPractice(){

        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons ");

        WebElement button1 = Driver.getDriver().findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        String expectedResult = "Clicked on button one!";
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//p[.='Clicked on button one!']")).getText(),expectedResult);

    }


}
//    XPATH Practice
//    DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #6:  XPATH LOCATOR practice
//        1. Open Chrome browser
//        2. Go to http://practice.cydeo.com/multiple_buttons
//        3. Click on Button 1
//        4. Verify text displayed is as expected:
//        Expected: “Clicked on button one!”
//
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS