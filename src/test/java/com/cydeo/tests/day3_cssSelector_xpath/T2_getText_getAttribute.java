package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer

        WebElement RememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = RememberMeLabel.getText();
        if(expectedRememberMeLabel.equals(actualRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else{
            System.out.println("Label verification FAILED");
        }
//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPassword = "Forgot your password?";
        String actualForgotPassword = forgotPassword.getText();
        if(expectedForgotPassword.equals(actualForgotPassword)){
            System.out.println("Forgot password link verification PASSED");
        }else{
            System.out.println("actualForgotPassword = " + actualForgotPassword);
            System.out.println("expectedForgotPassword = " + expectedForgotPassword);
            System.out.println("Forgot password link verification FAILED");
        }

//                5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPassword.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);
        if(actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("Href attribute value verification PASSED");
        }else{
            System.out.println("Href attribute value verification FAILED");
        }


//
//
//
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
    }
}
