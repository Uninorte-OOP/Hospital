/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital.system;

import core.person.Patient;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Ward {
    
    private int id;
    private ArrayList<Patient> patients;

    public Ward(int id) {
        this.id = id;
        this.patients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    public boolean addPatient(Patient patient) {
        if (!this.patients.contains(patient)) {
            this.patients.add(patient);
            return true;
        }
        return false;
    }
    
}
