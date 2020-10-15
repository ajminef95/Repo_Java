package String_HW;

public class EighthHomework {

    int maxTonerLevel = 100;
    int maxPagesInTray = 100;
    static int pages = 0;
    static int toner = 0;



    public void addToner (int addingToner) {
        if (addingToner <= maxTonerLevel && addingToner > 0) {

            toner = toner + addingToner;
            System.out.println("toners added: " + toner);

        } else {

            System.out.println("The toner limit is 100");
        }

    }


    public void addPages (int addingPages) {

        if (addingPages <= maxPagesInTray && addingPages > 0) {

            pages = pages + addingPages;
            System.out.println("pages added: " + pages);

    } else {

            System.out.println("The limit is 100 pages");
        }

}


      public void printSingle (int printingSingle) {

       for (int i = 0; printingSingle <= maxPagesInTray; printingSingle--) {

           System.out.println("single pages printed: " + printingSingle);
           System.out.println("toners used: " + printingSingle);
           break;

        }
           pages = pages - printingSingle;
           toner = toner - printingSingle;

      }


      public void printDouble (int printingDouble) {

        for (int i = 0; printingDouble <= maxPagesInTray; printingDouble--) {

            System.out.println("double pages printed: " + printingDouble);
            System.out.println("toners used: " + printingDouble*2);
            break;
        }
            pages = pages - printingDouble;
            toner = toner - printingDouble*2;


          }





      public void printerSummary () {

          System.out.println("toner level is: " + toner);
          System.out.println("pages count in tray is " + pages);





      }


      public void checkToner() {

        if (toner < 10) {

            System.out.println("Warning: Add toner");

        } else {
            System.out.println("toner's level is above 10");
        }


      }

















}



