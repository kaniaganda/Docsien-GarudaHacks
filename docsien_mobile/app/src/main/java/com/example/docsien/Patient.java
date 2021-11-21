package com.example.docsien;

public class Patient {
    public String username, password;

    public Medication medication;

    // Empty constructor for Firebase
    public Patient() {
    }

    public Patient(String username, String password) {
        this.username = username;
        this.password = password;
        this.medication = new Medication();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }
}
