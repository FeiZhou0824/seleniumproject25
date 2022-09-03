package com.cydeo.tests.homeWork.day5_HomeWork;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task4_VerifyingDropdown {

    @Test
    public void task4_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”

        WebElement simpleDropdown = Driver.getDriver().findElement(By.xpath("(//option[@selected='selected'])[1]"));
        String expectedValue = "Please select an option";
        Assert.assertEquals(simpleDropdown.getText(),expectedValue);
        System.out.println("simpleDropdown = " + simpleDropdown);

//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”

        WebElement stateSelection = Driver.getDriver().findElement(By.xpath("//option[.='Select a State']"));
        String expectedResult = "Select a State";

        Assert.assertEquals(stateSelection.getText(),expectedResult);
        System.out.println("stateSelection.getText() = " + stateSelection.getText());

    }


}

/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown


4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */
