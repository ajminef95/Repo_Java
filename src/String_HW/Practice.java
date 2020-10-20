package String_HW;

import java.util.Arrays;

public class Practice {


    public static void main(String[] args) {


        //find out if it's even

        int num = 11;
        boolean isEven = false;

        int remainder = num % 2;

        isEven = remainder == 0;


        System.out.println(isEven);

        int creditScore = 600;                      //Ternary Operator - (? : )

        double mortgageRate = creditScore > 650 ? 1.1 : 2.0;

        System.out.println("if creditScore is " + creditScore + " then the mortgageRate will be " + mortgageRate);

        int time = 19;

        String Greeting = time > 12 ? "Good Evening" : "Good Night";

        System.out.println("if time is " + time + " then say " + Greeting);

        int myResult = creditScore > 700 ? time : time++;
        System.out.println("if Credit Score is " + creditScore + " then time is " + time);
        System.out.println("My Result is " + myResult);

        boolean res = time < 10 ? creditScore > 700 : myResult < 20;
        System.out.println(res);

        int var1 = 10;
        var1 += 5;     // adding the value by 5

        System.out.println(var1);

        var1 -= 2;

        System.out.println(var1);

        var1 *= 10;

        System.out.println(var1);

        var1 /= 13;

        System.out.println(var1);

        var1 %= 4;

        System.out.println(var1);

        String cityName = "New York City";

        int cityNameLength = cityName.length();

        System.out.println("The length of New York City is: " + cityNameLength);

        String cityNameInLowerCase = cityName.toLowerCase();

        System.out.println("New York City in lowercase is: " + cityNameInLowerCase);

        String cityNameInUpperCase = cityName.toUpperCase();

        System.out.println("New York City in uppercase is: " + cityNameInUpperCase);

        boolean isEqual = cityName.equals(cityNameInUpperCase);

        System.out.println("Is the cityName equals to cityName in Uppercase: " + isEqual);

        boolean isEqualsIgnoreCase = cityName.equalsIgnoreCase(cityNameInUpperCase);

        System.out.println("does " + cityName + " have the same value as " + cityNameInUpperCase + ": " + isEqualsIgnoreCase);

        boolean isContains = cityName.contains("new");

        System.out.println("does " + cityName + " contain the value new: " + isContains);

        String cityNameReplace = cityName.replace('Y', 'Z');

        System.out.println(cityNameReplace);

        String cityNameReplaceMultiple = cityName.replace("ew", "ewly");

        System.out.println(cityNameReplaceMultiple);

        System.out.println(cityName);

        char charAtIndex7 = cityName.charAt(7);

        System.out.println(charAtIndex7);

        String hello = "Sherlock Holmes";

        char lastIndexChar;

        int len = hello.length();
        int lastIndex = len - 1;

        lastIndexChar = hello.charAt(lastIndex);

        System.out.println(lastIndexChar);

        int indexOfN = cityName.indexOf("N");

        System.out.println(indexOfN);

        cityName = "New York City iN The ToWN";

        int indexOfn = cityName.indexOf("n");

        System.out.println(indexOfn);

        int indexOfMultiple = cityName.indexOf("York C");

        System.out.println(indexOfMultiple);

        boolean cityNameStartsWith = cityName.startsWith("ne");

        System.out.println(cityNameStartsWith);

        boolean cityNameStartsWithNewY = cityName.startsWith("New Y");

        System.out.println(cityNameStartsWithNewY);

        boolean cityNameEndsWith = cityName.endsWith("e ToWN");

        System.out.println(cityNameEndsWith);

        int lastIndexOfN = cityName.lastIndexOf("N");

        System.out.println("Last Index of N is: " + lastIndexOfN);

        System.out.println(cityName);

        String cityName1 = " New York City in the Town";

        String cityNameTrim = cityName1.trim();

        System.out.println(cityName1);

        System.out.println(cityNameTrim);

        String subFrom10 = cityName1.substring(10);

        System.out.println(subFrom10);

        String subFrom10To15 = cityName1.substring(10, 15);

        System.out.println(subFrom10To15);

        String[] afterSplitBy = cityName1.split(" ");

        System.out.println(Arrays.toString(afterSplitBy));
        System.out.println(afterSplitBy);

        String statement = " There could be any value, task is to find the length of the last word in the world";

        int lastSpaceIndex = statement.lastIndexOf(" ");

        String lastWord = statement.substring(lastSpaceIndex + 1);

        int lastWordLength = lastWord.length();

        System.out.println("The last word in the statement is " + lastWord + " and the length of the last word is " + lastWordLength);

        double[] myBills = new double[5];

        myBills[0] = 100.9;

        myBills[1] = 4.4;

        myBills[2] = 2.1;

        myBills[3] = 9.2;

        myBills[4] = 9.8;

        System.out.println(Arrays.toString(myBills));

        String threeWordSentence = "Very Good Morning";

        String[] splitwords = threeWordSentence.split("eryoodorning");

        System.out.println(Arrays.toString(splitwords));


        //for (int i=1 ; i<=5 ; i++) {
        //System.out.println("Hello - " +i);


        String[] names = {"Happy, Sad, Peace, Joy"};

        for (String name111 : names) {
            System.out.println(name111);
        }



    }


    public int checkVowelCount(String vowels) {
        String statementX = "have a great day to you";
        int vowelCount = 0;

        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == ('i') || vowels.charAt(i) == ('o') || vowels.charAt(i) == ('u')) {
                vowelCount++;
            }

        }

        return vowelCount;


    }



}
