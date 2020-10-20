package String_HW;

public class MyMainForMidTermExam {


    public static void main(String[] args) {


    MidTermExam mTExam = new MidTermExam();

        int[] array1 = {4, 24, 98, 24, 56, 148, 24, 78, 24};

        System.out.println(mTExam.removingAGivenInputValue(array1, 24));

        mTExam.pointsChargedAgainst(80);











    }

















}

/**
 * Question 1:
 * Create a method to return an int-array after removing a given int-value
 * from a given int array.
 *
 * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
 * Returned array: {32, 14, 98, 56, 148, 78}
 *
 * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
 * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
 *
 *
 */
/**
 * Question 2:
 * Create a method to return missing smallest positive integer (greater than 0)
 * from given array.
 *
 * Example:
 * 	For array : {1, 3, 5, 4, 2, 7}
 * 	Method should return : 6
 *
 * 	For array : {-1, -3, 4, 2}
 * 	Method should return : 1
 *
 * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
 * 	Method should return : 4
 *
 */
/**
 * Question 3:
 * Scenario: Traffic ticketing system
 * Write a method, that will print (not return) the points charged against
 * the license for over speeding.
 *
 *    1. Speed Limit = 70
 *    2. Every 5 miles over the speed limit will add 1 point
 *    3. If user gets 12 points for a speed then license is suspended
 *
 *  Example:
 *      user speed = 74 ; 0 points
 *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
 *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
 *      user speed = 178 ; 21 points (License suspended).
 *      user speed = 70 ; Thank you for driving within the speed limit.
 *
 */