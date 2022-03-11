package com.cydeo.tests.day9_javeFaker_testbase_driverUtil;

public class Singleton {

    //#Creat private constructor

    private Singleton(){}

    //#-create private static string
    //prevent access ad provide a getter method
    private static String word;


    //This utility method will return the"word" int he way we want to return
    public static String getWord(){

        if (word == null){
            System.out.println("First time call. Word object is null. " +
                    "Assigning value to it now!");
            word = "something";
        }else {
            System.out.println("Word already has value.");
        }

        return word;
    }
}
