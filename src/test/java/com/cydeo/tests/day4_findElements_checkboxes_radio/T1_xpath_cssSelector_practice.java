package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)
//        a. “Home” link
        WebElement homeLink_ex1 =  driver.findElement(By.cssSelector("a[class='nav-link']")); // using cssSelector
        WebElement homeLink_ex2 =  driver.findElement(By.cssSelector("a.nav-link")); // using cssSelector syntax #2
        WebElement homeLink_ex3 =  driver.findElement(By.cssSelector("a[href='/']"));// using href another value

//        b. “Forgot password” header
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));// using cssSelector

        // locate header using xpath,
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

//        c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
//        d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement inputBox_ex3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

//        e. “Retrieve password” button

        WebElement retrievePassword_ex1 = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        // f."Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

//        4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePassword_ex1.isDisplayed() = " + retrievePassword_ex1.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
//        First solve the task with using cssSelector only. Try to create 2 different
//        cssSelector if possible

//
//        Then solve the task using XPATH only. Try to create 2 different
//        XPATH locator if possible

    }
}
