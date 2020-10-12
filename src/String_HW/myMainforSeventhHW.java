package String_HW;

import java.sql.SQLOutput;

public class myMainforSeventhHW {

    public static void main(String[] args) {

        // Homework 7

       SeventhHomework h7 = new SeventhHomework();

       double[] values = {5.0, 10.0, 15.0, 20.0};
       double result = h7.addAllNumbersInArray(values);
        System.out.println(result);       //no.1 method is working smoothly.

       int number = 9;
       boolean isIt = h7.isInputNumberPrime(number);
        System.out.println(isIt);     // no.2 method is working smoothly.

        String name = "racecar";
        boolean isItPal = h7.isTheStringPalindrome(name);
        System.out.println(isItPal);       // no.3 method is working smoothly.


        //String[] words = {"good", "generous", "war", "legend", "legend"};
        //h7.duplicateValues(words);    //no.4 method is not working, needs a fix.



        String[] arr1 = {"hello", "happy", "peace"};
        String[] arr2 = {"hello", "happy", "peace"};

        h7.commonValues(arr1, arr2);   // no.5 method is working smoothly.




        /**
         * 1. Create a method to add all the numbers in a array with double-values

         *
         * 2. Create a method to verify if the input-int-number is prime or not
         * prime number: number divisible by 1 and itself
         * eg: 7 -> prime
         * 21 -> not a prime
         *
         * 3. Create a method to find if given string is palindrome.
         * Palindrome: string which reads the same in reverse.
         * racecar  ->  racecar
         * level    ->  level
         *
         * 4. Write a method to print(no return) the duplicate values in a given String array.
         * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
         * Method should print -> hello, happy
         * hello
         * happy
         *
         * 5. Write a method to print(no return) the common values between two arrays (string arrays)
         * Input arrays:
         *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
         *  arr2 -> {"hello", "grow", "laugh" , "peace"}
         * Method should print -> hello, peace, laugh
         * hello
         * peace
         * laugh
         */


























    }










}
