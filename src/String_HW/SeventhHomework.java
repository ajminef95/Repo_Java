package String_HW;

public class SeventhHomework {


    // 1. Create a method to add all the numbers in a array with double-values


    public double addAllNumbersInArray (double[] arr) {

        double sum = 0.0;

        for(int i =0; i<arr.length; i++) {

            sum = sum + arr[i];

        }

        return sum;

    }


    //2. Create a method to verify if the input-int-number is prime or not


    public boolean isInputNumberPrime (int inputNumber) {

        for (int i = 2; i < inputNumber; i++)
        if (inputNumber % i == 0) {

            return false;
        } else {


        }
           return true;
    }

    //3. Create a method to find if given string is palindrome.

    public boolean isTheStringPalindrome (String name) {

        boolean result = false;
        String givenString = "";
        String reverseString = "";

        for (int i =0; i<name.length(); i++) {

            reverseString = name.substring(i, i + 1) + reverseString;

        }
             givenString = name;

        if (givenString.equalsIgnoreCase(reverseString)) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    //4. Write a method to print(no return) the duplicate values in a given String array


    //public void duplicateValues  (String[] arr) {

        //for (int i=0; i<arr.length; i++) {
            //for (int j=0; j<arr.length; j++) {
                //if (arr[i].equalsIgnoreCase(arr[j]) && i!=j) {
                    //System.out.println(arr[i].equalsIgnoreCase(arr[j]));

                //} else {
                    //System.out.println(i!=j);
                    //break;                       // this method needs a minor fix
                                                 // please help me identify what im doing wrong here
                //}

            //}

        //}

    //}

    // 5. Write a method to print(no return) the common values between two arrays (string arrays)
    // Input arrays:
    // arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"
    // arr2 -> {"hello", "grow", "laugh" , "peace"}
    // Method should print -> hello, peace, laugh


    public void commonValues (String[] arr1, String[] arr2) {

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    System.out.println("common values are: " + arr1[i]);
                    break;
                }
                }
            }
        }
    }