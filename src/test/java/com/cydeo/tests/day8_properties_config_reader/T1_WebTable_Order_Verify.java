package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTabUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//     1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables ");
    }



    @Test
    public void order_name_verify_test(){
        //Locate the cell that has Bob Martin text in it
        WebElement bobCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']"));
                                                          // "//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"  //this works too

//        2. Verify Bob’s name is listed as expected.
        String expectedName  = "Bob Martin";
        String actualName = bobCell.getText();
        System.out.println("actualName = " + actualName);
        Assert.assertEquals(actualName,expectedName);
//        Expected: “Bob Martin”
//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021
        WebElement dateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[7]//td[.='Bob Martin']/following-sibling::td[3]"));
                                                         //"//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"
        String expectedDate = "12/31/2021";
        String actualDate =dateCell.getText();
        System.out.println("actualDate = " + actualDate);
        Assert.assertEquals(actualDate,expectedDate);
    }

    @Test
    public void test2(){
       String customerOrderDate = WebTabUtils.returnOrderDate(driver,"John Doe");
        System.out.println("customerOrderDate = " + customerOrderDate);
    }

    @Test
    public void test3(){
        WebTabUtils.orderVerify(driver,"Bart Fisher", "01/16/2021");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
