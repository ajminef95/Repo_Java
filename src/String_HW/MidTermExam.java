package String_HW;

public class MidTermExam {


    public int[] removingAGivenInputValue(int[] arr, int inputValue) {
        int[] result;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputValue) {
                result = new int[arr.length-inputValue];
                break;

            } else {

              arr = arr;
            }


        }


            return arr;

    }


    //public int smallestPositiveInteger (int[] array)
    // unable to solve





    public void pointsChargedAgainst (int userSpeed) {

        int speedLimit = 70;
        int points = 0;

        for (int i = 0; i > speedLimit; i+=5) {
            userSpeed = i;
            points++;
            System.out.println("add 1 point");
            break;

        } if (points >= 12) {
            System.out.println("Your license is suspended");
        } if (userSpeed <=70 && userSpeed > 0) {
            System.out.println("Thank you for driving within the limit");

        }





        }




    }







