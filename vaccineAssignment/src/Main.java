// Program:             Main.java
// Author:              Jayce Johnson
// Date:                March 6th, 2025
// Description:         Retrieves and displays information about
//                      COVID-19 vaccines.

import java.util.Scanner;

public class Main {

    // For asking the user if they want a table or not
    public static boolean tableTrue;

    public static void main(String[] args) {

        // Ask user if they want table
        Scanner userInput = new Scanner(System.in);
        System.out.println("Press 1 to have output in table format, or any key to continue: ");

        if (userInput.nextInt() == 1) {
            tableTrue = true;
        }

        // They can press any key to decline the table
        else {
            tableTrue = false;
        }


        // Use default constructor to create empty vaccine
        Vaccine pfizerObject = new Vaccine();


        // If the user wants a table this is how we print it
        if (tableTrue == true) {
            System.out.println("ID | NAME | COST | AVAILABILITY |   EXPIRY   | HANDLING INSTRUCTIONS");
            System.out.print(pfizerObject.getVaccineID() + "    ");
            System.out.print(pfizerObject.getVaccineName() + "   ");
            System.out.print(pfizerObject.getVaccineCost() + "         ");
            System.out.print(pfizerObject.getUnitsAvail() + "         ");
            System.out.print(pfizerObject.getExpiryDate() + "   ");
            System.out.print(pfizerObject.getHandlingInstructions() + "   ");

        } // Closes the if-table


        else {
            System.out.println("ID: " + pfizerObject.getVaccineID());
            System.out.println("NAME: " + pfizerObject.getVaccineName());
            System.out.println("COST: " + pfizerObject.getVaccineCost());
            System.out.println("AVAILABILITY: " + pfizerObject.getUnitsAvail());
            System.out.println("EXPIRY: " + pfizerObject.getExpiryDate());
            System.out.println("HANDLING INSTRUCTIONS: " + pfizerObject.getHandlingInstructions());
        } // Closes the else-table

    } // Closes main method

} // Closes main class