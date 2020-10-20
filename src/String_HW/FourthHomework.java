package String_HW;

public class FourthHomework {

    public static void main(String[] args) {

        // Subject - Homework 4

        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */

        double studentScore = 190;     //  (score/max)*100
        double maxScore= 200;

        double studentPercentage = studentScore/maxScore*100;
        System.out.println("Student's score in percentage is : " + studentPercentage);

        if (studentPercentage>=91) {
            System.out.println("Student's Grade is A");
        } else {
            System.out.println("Student's Grade is below A");
        } if (studentPercentage>=81 && studentPercentage>80) {
            System.out.println("Student's Grade is B");
        }






        // calculate percentage
        // your percentage: XX.yy and your grade is: A


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int num = 20;

        if (num%3==0) {
            System.out.println("number is divisible by 3");
        } else {
            System.out.println("number is not divisible by 3");
        }

        if (num%5==0) {
            System.out.println("number is divisible by 5");
        } else {
            System.out.println("number is not divisible by 5");
        }

        if (num%3==0 && num%5==0) {
            System.out.println("number is divisible by both 3 and 5");
        } else {
            System.out.println("if not divisible by 3, the number is : " + (num/3));
            System.out.println("if not divisible by 5, the number is : " + (num/5));
        }


        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */
        char gear = 'D';
        String cMode = "Sport";  // Snow, Sport or Eco

        switch(gear) {
            case 'P':
                System.out.println("You can park car");
                break;
            case 'D':
                System.out.println("Drive car");
                switch (cMode) {
                    case "Snow":
                        System.out.println("You are on Snow Mode");
                        break;
                    case "Sport":
                        System.out.println("You are on Sport Mode");
                        break;
                    case "Eco":
                        System.out.println("You are on Eco mode");
                }
                break;
            case 'N':
                System.out.println("You can put the car in car wash");
                break;
            case 'R':
                System.out.println("You can reverse the car");
                break;
            default:
                System.out.println("Invalid");
                break;

                }
        }





















    }
