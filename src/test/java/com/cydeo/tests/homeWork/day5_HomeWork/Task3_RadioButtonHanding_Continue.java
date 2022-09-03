package com.cydeo.tests.homeWork.day5_HomeWork;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task3_RadioButtonHanding_Continue {

    @Test
    public void task2_test() {

        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons ");

        WebElement hockeyButton = Driver.getDriver().findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();


    }

}
