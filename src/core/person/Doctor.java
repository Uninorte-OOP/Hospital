/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.hospital.system.Appoiment;
import core.hospital.system.Team;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public abstract class Doctor {
    
    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int id, Team team) {
        this.id = id;
        this.team = team;
        this.appoiments = new ArrayList<>();
        this.patients = new ArrayList<>();
        
        this.team.addDoctor(this);
    }

    public int getId() {
        return id;
    }
    
    public boolean addAppoiment(Appoiment appoiment) {
        if (!this.appoiments.contains(appoiment)) {
            this.appoiments.add(appoiment);
            return true;
        }
        return false;
    }
    
    public boolean addPatient(Patient patient) {
        if (!this.patients.contains(patient)) {
            this.patients.add(patient);
            return true;
        }
        return false;
    }
    
}
