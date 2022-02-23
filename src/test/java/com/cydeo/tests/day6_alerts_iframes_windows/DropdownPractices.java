package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public  void dropdown_task5() throws InterruptedException {
//        TC #5: Selecting state from State dropdown and verifying result
//        1. Open Chrome browser
//

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//        3. Select Illinois
        //Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");
//        4. Select Virginia
        //Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

//        5. Select California
        //Thread .sleep(1000);
        stateDropdown.selectByIndex(5);
//        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);
    }

    @Test
    public void dropdown_task6(){
//        3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
//                Select year using  : visible text
        yearDropdown.selectByVisibleText("1923");
//        Select month using   : value attribute
        monthDropdown.selectByValue("11");

//        Select day using : index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear = "1923";
        String expectedMonth="December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //creat assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);

    }



    @Test
    public void dropdown_task7(){
//        TC #7: Selecting value from non-select dropdown
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown
//        3. Click to non-select dropdown

        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        nonSelectDropdown.click();

//        4. Select Facebook from dropdown
        WebElement facebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebook.click();
//        5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);


    }
    @AfterMethod
    public void teardownMethod(){
       driver.close();
    }
}
