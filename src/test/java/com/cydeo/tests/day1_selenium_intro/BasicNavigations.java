package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Creat instance of the Selenium WebDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // this line will maximize the broswer size
        driver.manage().window().maximize();

       // driver.manage().window().fullscreen();  //this one only works for Mac

        //3- Go to "https:// www.tesla.com"
        driver.get("https://www.tesla.com");

        //get title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //us selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        Thread.sleep(3000);
        // use navigate().to ():
        driver.navigate().to("https://www.google.com");

        //get the current title after get the google page.
        currentTitle = driver.getTitle();


       // System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);

        //Get the current URL using selenium

        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this will close the currently opened window
        driver.close();

        //this will close all the opened windows
        driver.quit();


    }
}
