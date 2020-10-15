package String_HW;

public class myMainforEighthHW {

    public static void main(String[] args) {

        EighthHomework printer = new EighthHomework();

      printer.addPages(100);   // method addPages is working smoothly.
      printer.addToner(100);   // method addToner is working smoothly.
      printer.printSingle(20); // method printSingle is working smoothly.
      printer.printDouble(20); //method printDouble is working smoothly.
      printer.printerSummary();              // method printerSummary is working smoothly.
      printer.checkToner();                  // method checkToner is working smoothly.







        //Subject - Homework - 8

        /**
         * Create a printer
         *
         * max toner level = 100
         * max pages in tray = 100
         * with 1 page printing, 1 toner is being used
         *
         * 1. addToner
         * 2. addPages
         * 3.
         *      a) printSingle
         *      b) printDouble
         * 4. printerSummary
         *      Toner level:
         *      Pages count in tray:
         * 5. checkToner
         *      if toner is less than 10; it should warn to "Add toner"
         */

        /**
         * printerSummary   // T: 100, P:100
         *
         * printSingle(10)
         *
         * printerSummary   // T: 90, P:90
         *
         * printDouble(10)
         *
         * printerSummary   // T: 80, P:85
         *
         */














    }


}
