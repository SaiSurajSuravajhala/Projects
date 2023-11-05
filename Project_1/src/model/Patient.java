/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Patient {
    private String patientId;
    private String primaryDoctor;
    private String dateOfLastVisit;
    private String dateOfNextAppointment;
    private String medication;
    private String allergies;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getDateOfLastVisit() {
        return dateOfLastVisit;
    }

    public void setDateOfLastVisit(String dateOfLastVisit) {
        this.dateOfLastVisit = dateOfLastVisit;
    }

    public String getDateOfNextAppointment() {
        return dateOfNextAppointment;
    }

    public void setDateOfNextAppointment(String dateOfNextAppointment) {
        this.dateOfNextAppointment = dateOfNextAppointment;
    }
    
    
    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.medication = allergies;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }
    
    
    
    
}
