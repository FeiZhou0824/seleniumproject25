package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
    /*
    Creating a private constructor, so we are closing access to the object of this class from outside of the class
     */
    private Driver(){}
    /*
    We make WebDriver private, because we wnt to close access from outside the class.
    We make it static because we will use it in a static method.
     */
    private static WebDriver driver;


}
