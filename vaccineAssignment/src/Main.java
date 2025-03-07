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
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to have your output in table format?\nPress 1.");

        if (userInput.nextInt() == 1) {
            tableTrue = true;
        }
        else {
            tableTrue = false;
        }



    } // Closes main method

} // Closes main class