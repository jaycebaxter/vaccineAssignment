// Program:             Vaccine.java
// Author:              Jayce Johnson
// Date:                March 6th, 2025
// Description:         Retrieves and displays information about
//                      COVID-19 vaccines.
/**
 * @author Jayce Johnson
 */

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

    /**
     *
     * @param vaccineID
     */
    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }

    /**
     *
     * @return
     */
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

    // Constructor that sets all variables to default value
    public Vaccine(){
        vaccineID = 0;
        vaccineName = "None";
        vaccineCost = 0.0;
        unitsAvail = 0;

        // Stole because I couldn't figure this out
        // https://www.baeldung.com/java-creating-localdate-with-values
        expiryDate = LocalDate.of(1970, 1, 1);
        handlingInstructions = "None";
    } // Closes default constructor

    // Constructor with parameters

    /**
     *
     * @param vaccineID
     * @param vaccineName
     * @param vaccineCost
     * @param unitsAvail
     * @param expiryDate
     * @param handlingInstructions
     */
    public Vaccine(int vaccineID, String vaccineName, double vaccineCost, int unitsAvail, LocalDate expiryDate, String handlingInstructions) {
        this.vaccineID = vaccineID;
        this.vaccineName = vaccineName;
        this.vaccineCost = vaccineCost;
        this.unitsAvail = unitsAvail;
        this.expiryDate = expiryDate;
        this.handlingInstructions = handlingInstructions;
    } // Closes constructor with parameters

} // Closes the vaccine class