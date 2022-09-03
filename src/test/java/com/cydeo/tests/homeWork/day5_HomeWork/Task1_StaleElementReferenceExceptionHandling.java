package com.cydeo.tests.homeWork.day5_HomeWork;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_StaleElementReferenceExceptionHandling {

    @Test
    public void tc1_test(){

        Driver.getDriver().get("https://practice.cydeo.com/add_remove_elements/ ");
        WebElement addElementButton = Driver.getDriver().findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//button[@onclick='deleteElement()']"));
        Assert.assertTrue(deleteButton.isDisplayed());

        deleteButton.click();

        try{
            Assert.assertFalse(deleteButton.isDisplayed());
        }catch(StaleElementReferenceException e){

        }




    }
}
/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */