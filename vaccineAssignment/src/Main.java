// Program:             Main.java
// Author:              Jayce Johnson
// Date:                March 6th, 2025
// Description:         Retrieves and displays information about
//                      COVID-19 vaccines.

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    // For asking the user if they want a table or not
    public static boolean tableTrue;

    public static void main(String[] args) {

        // Ask user if they want table
        Scanner userInput = new Scanner(System.in);
        System.out.println("Press 1 to have output in table format, or any key to continue: ");

        // Checks that it has an int and that it's equal to 1
        if (userInput.hasNextInt()) {
            if (userInput.nextInt() == 1) {
                tableTrue = true;
            }
        }

        // If not 1, no table
        else {
            tableTrue = false;
        }

        // Code was hanging idk what this does but it worked in the last assignment too. Lol
        userInput.nextLine();

        // Use default constructor to create empty vaccine
        Vaccine pfizerObject = new Vaccine();

        // Filling the empty vaccine with real values
        pfizerObject.setVaccineID(100629175);
        pfizerObject.setVaccineName("Pfizer");
        pfizerObject.setVaccineCost(25.99);
        pfizerObject.setUnitsAvail(6);
        pfizerObject.setExpiryDate(LocalDate.of(2026, 04, 13));
        pfizerObject.setHandlingInstructions("Just have fun and be yourself :)");

        // If the user wants a table this is how we print it
        if (tableTrue == true) {
            System.out.println("    ID    |    NAME    | COST | AVAILABILITY |   EXPIRY   | HANDLING INSTRUCTIONS");
            System.out.print(pfizerObject.getVaccineID() + "   ");
            System.out.print(pfizerObject.getVaccineName() + "       ");
            System.out.print(pfizerObject.getVaccineCost() + "        ");
            System.out.print(pfizerObject.getUnitsAvail() + "         ");
            System.out.print(pfizerObject.getExpiryDate() + "  ");
            System.out.print(pfizerObject.getHandlingInstructions() + "    ");

        } // Closes the if-table

        else {
            System.out.println("ID: " + pfizerObject.getVaccineID());
            System.out.println("NAME: " + pfizerObject.getVaccineName());
            System.out.println("COST: " + pfizerObject.getVaccineCost());
            System.out.println("AVAILABILITY: " + pfizerObject.getUnitsAvail());
            System.out.println("EXPIRY: " + pfizerObject.getExpiryDate());
            System.out.println("HANDLING INSTRUCTIONS: " + pfizerObject.getHandlingInstructions());
        } // Closes the else-table

        // Using constructor with parameters to make more vaccines
        Vaccine sputnikObject = new Vaccine(100957748, "Sputnik V", 3.75, 11, LocalDate.of(2026, 11, 6), "Do not");
        Vaccine zyCovObject = new Vaccine(100749351, "ZyCov-D", 15.90, 16, LocalDate.of(2027, 8, 15), "Can you tell I'm on the wikipedia page for covid vaccines I'm learning so much");

        // Adds all 3 vaccines to array or list or whatever
        Vaccine[] vaccineList = {pfizerObject, sputnikObject, zyCovObject};

        // I was double printing the pfizer info so now it will only print if it hasn't already
        if (tableTrue == false) {
            // Prints pfizer info
            System.out.println("    ID    |      NAME      | COST | AVAILABILITY |   EXPIRY   | HANDLING INSTRUCTIONS");
            System.out.print(pfizerObject.getVaccineID() + "   ");
            System.out.print(pfizerObject.getVaccineName() + "       ");
            System.out.print(pfizerObject.getVaccineCost() + "        ");
            System.out.print(pfizerObject.getUnitsAvail() + "         ");
            System.out.print(pfizerObject.getExpiryDate() + "  ");
            System.out.print(pfizerObject.getHandlingInstructions() + "          ");
        }

        // Prints sputnik info
        System.out.print("\n" + sputnikObject.getVaccineID() + "   ");
        System.out.print(sputnikObject.getVaccineName() + "    ");
        System.out.print(sputnikObject.getVaccineCost() + "         ");
        System.out.print(sputnikObject.getUnitsAvail() + "        ");
        System.out.print(sputnikObject.getExpiryDate() + "  ");
        System.out.print(sputnikObject.getHandlingInstructions() + "    ");

        // Prints zycov info
        System.out.print("\n" + zyCovObject.getVaccineID() + "   ");
        System.out.print(zyCovObject.getVaccineName() + "      ");
        System.out.print(zyCovObject.getVaccineCost() + "         ");
        System.out.print(zyCovObject.getUnitsAvail() + "        ");
        System.out.print(zyCovObject.getExpiryDate() + "  ");
        System.out.print(zyCovObject.getHandlingInstructions() + "    ");

    } // Closes main method

} // Closes main class