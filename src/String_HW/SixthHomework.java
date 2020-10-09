package String_HW;

public class SixthHomework {

    public static void main(String[] args) {

        /**
         * Create a method to find average of an int-array
         *
         */


         // write code to find average
         // Decide on the return type
         // 22, 11, 33, 44, 55
         // add all / total number



      // Using Array Average method to find the average in array in the main

        int[] values = {5,10,15,20,25};
        double average = arrayAvg(values);
        System.out.println("The average of this int array is: " + average);


        // Using indexOfGivenName method to find the index of any name in array in the main

        String[] names = {"Ronaldo", "Griezmann", "Messi", "Beckham", "De Bruyne"};
        String nameToSearch = "Messi";

        indexOfGivenName(names, nameToSearch);



        /**
         *
         * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
         * String nameToSearch = "philip";
         * Create a method (NO return) that will print the index of given name in the given array
         *
         */

    }

          public static int arrayAvg(int[] arr) {

          int sum = 0;

          for (int i=0; i<arr.length; i++) {

              sum = sum + arr[i];
          }

              return sum/arr.length;


    }


          public static void indexOfGivenName(String[] names, String nameToSearch) {

                int nameIndex = -1;

                for (int i=0; i<names.length; i++) {
                    if (names[i].equalsIgnoreCase(nameToSearch)) {

                    System.out.println("name is at index: " +i);
                    break;

                }


            }


          }










    }

