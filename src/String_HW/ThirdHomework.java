package String_HW;

import java.util.Arrays;

public class ThirdHomework {

    public static void main(String[] args) {


        // Subject: Homework-3

        /**
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */

        String fullName = "Ajmine Joy";

        String firstName = "Ajmine";

        int len = firstName.length();

        System.out.println("The length of my first name is : " + len);

        String lastName = "Joy";

        boolean startsWithK = lastName.startsWith("K");

        System.out.println("Does my last name start with 'K' : " + startsWithK);

        char lastAlphabet = firstName.charAt(5);

        System.out.println("The last alphabet of my first name is : " + lastAlphabet);

        boolean endsWithM = lastName.endsWith("M");

        System.out.println("Does my last name end with M : " + endsWithM);


        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */

        String myStatement = "I am a good programmer";

        String[] words = myStatement.split(" ");

        int len1 = words.length;

        System.out.println("The total number of words in myStatement : " + len1);

        String myStatementReplace = myStatement.replace('r', 'f');

        System.out.println("Replaced all the 'r' characters with 'f' characters " + myStatementReplace);



        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */

        String firstName1 = "Ajmine";

        int indexOfe = firstName1.lastIndexOf("e");

        int newLength = indexOfe+1;

        System.out.println("The length of my first name is : " + newLength);

        // we know that the length of a string is always lastIndex + 1

        /**
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */

        String strNew = "hello dear, how are you?";
        int len2 = strNew.length();

        boolean ifLenIsGr = len2>10?true:false;

        System.out.println("Is the length of 'hello dear, how are you' greater than 10 : " + ifLenIsGr);

        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */

        String threeWordsSentence = "hApPy nEW yeAr";

        System.out.println(threeWordsSentence);

        threeWordsSentence = threeWordsSentence.toLowerCase();
        threeWordsSentence = threeWordsSentence.replace("h", "H");
        threeWordsSentence = threeWordsSentence.replace("n", "N");
        threeWordsSentence = threeWordsSentence.replace("y", "Y");


        System.out.println(threeWordsSentence);


        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */

        String threeWordsSentence1 = "Lab sessIONS classes";

        threeWordsSentence1 = threeWordsSentence1.toUpperCase();

        char firstAbbrev = threeWordsSentence1.charAt(0);
        char secondAbbrev = threeWordsSentence1.charAt(4);
        char thirdAbbrev = threeWordsSentence1.charAt(13);

        System.out.println("Abbreviation is : " + firstAbbrev + secondAbbrev + thirdAbbrev);

         //tesgttt
























    }
}
