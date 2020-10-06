package String_HW;

public class FifthHomework {

    public static void main(String[] args) {

// Subject - Homework-5

        /**
         * Write code/method to return abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
        String msg = "have happy and prosperous life";
        String abr = "";

        String[] words = msg.toUpperCase().split(" ");

        for (int i = 0; i <= words.length-1; i++) {
            abr = abr + words[i].charAt(0);
        }
        System.out.println("Abbreviation: " + abr);


        /**
         * Change the string to title case
         */
        String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);

        String[] titleCase = line.toLowerCase().split(" ");
        line= "";

        for (int i = 0; i<=titleCase.length-1; i++) {
            line = line + " " + titleCase[i].substring(0,1).toUpperCase() + titleCase[i].substring(1);
        }

        line = line.trim();
        System.out.println("Line (After modification) : " + line);


        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);

        int j=0;
        while (j<message.length()) {
            reverseMessage = message.substring(j, j+1) + reverseMessage;
            j++;
        }

        System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah



        }

    }



