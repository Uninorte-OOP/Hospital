/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.hospital.system.Appoiment;
import core.hospital.system.Team;
import core.hospital.system.Ward;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Patient {
    
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(int id, Team team, Ward ward) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        this.appoiments = new ArrayList<>();
        this.doctors = new ArrayList<>();
        
        this.team.addPatient(this);
        this.ward.addPatient(this);
    }

    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public Ward getWard() {
        return ward;
    }
    
    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }
    
    public boolean addAppoiment(Appoiment appoiment) {
        if (!this.appoiments.contains(appoiment)) {
            this.appoiments.add(appoiment);
            return true;
        }
        return false;
    }
    
    public ArrayList<Integer> getDoctorsId() {
        ArrayList<Integer> doctorsId = new ArrayList<>();
        for (Appoiment appoiment : this.appoiments) {
            doctorsId.add(appoiment.getDoctor().getId());
        }
        return doctorsId;
    }
    
    public int numberOfAppoiments() {
        return this.appoiments.size();
    }
    
    public int numberOfDoctors() {
        return this.doctors.size();
    }
    
}
