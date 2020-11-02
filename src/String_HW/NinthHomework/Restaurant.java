package String_HW.NinthHomework;

public class Restaurant {


     String name = "Mythical Kitchen";
     int guestCapacity = 100;
     static int guestCount;


     public Restaurant (String Rname, int RGuestCapacity) {
            Rname= name;
            RGuestCapacity = guestCapacity;
     }



     public void SeatsAvailable () {

         int seats = guestCapacity - guestCount;

         System.out.println("Seats available: " +seats);

         if (seats > guestCapacity && seats < 0) {
             System.out.println("Please check back again in 15 minutes");
         }

     }


     public void seatsParty (int seatParty) {
         if (seatParty > 0 && seatParty <= guestCapacity - guestCount) {
         guestCount = guestCount + seatParty;
         }

         System.out.println("Seats Reserved: " + seatParty);


     }


     public void removeParty (int removingParty) {
         if (removingParty > 0 && removingParty <= guestCount) {
         guestCount = guestCount - removingParty;

         }

         System.out.println("Seats Removed: " + removingParty);


     }


     public void printRestaurantSummary () {

         System.out.println("Restaurant Name: " + name);
         System.out.println("Current Guest Count: " + guestCount);
         System.out.println("Guest Capacity: " + guestCapacity);


     }

































}

/**
 * Submission Date: Thursday (Nov 5th)
 */
/**
 * Create a Restaurant class with attribute name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
 * 2. Create a method that seatsParty
 * 3. Create a method that removesParty
 * 4. Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity
 * 5. Create a method that printsRestaurantSummary
 *      Name:
 *      Current Guest Count:
 *      Guest Capacity:
 *
 *
 */
/**
 * 2 Classes
 * Restaurant -> all methods and variables
 * RestaurantApp -> main method,
 *  in inside main...will create object of Restaurant class, and use methods from Restaurant class
 *
 */
