package com.cydeo.tests.homeWork.day5_HomeWork;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_RadiobuttonHandling {

    @Test
    public void task2_test(){

        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons ");

        WebElement hockeyButton = Driver.getDriver().findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        Assert.assertTrue(hockeyButton.isSelected());

    }

}
/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */