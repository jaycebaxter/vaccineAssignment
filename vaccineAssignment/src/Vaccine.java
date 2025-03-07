// Program:             Vaccine.java
// Author:              Jayce Johnson
// Date:                March 6th, 2025
// Description:         Retrieves and displays information about
//                      COVID-19 vaccines.

import java.time.LocalDate;

// Vaccine class
public class Vaccine {

    // Declaring all variables as private
    private int vaccineID;
    private String vaccineName;
    private double vaccineCost;
    private int unitsAvail;
    private LocalDate expiryDate;
    private String handlingInstructions;


    // Getters and setters

    public int getVaccineID() {
        return vaccineID;
    }

    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public double getVaccineCost() {
        return vaccineCost;
    }

    public void setVaccineCost(double vaccineCost) {
        this.vaccineCost = vaccineCost;
    }

    public int getUnitsAvail() {
        return unitsAvail;
    }

    public void setUnitsAvail(int unitsAvail) {
        this.unitsAvail = unitsAvail;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getHandlingInstructions() {
        return handlingInstructions;
    }

    public void setHandlingInstructions(String handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    
} // Closes the vaccine class
