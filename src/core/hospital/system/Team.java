/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital.system;

import core.person.ConsultantDoctor;
import core.person.Doctor;
import core.person.Patient;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Team {
    
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int id) {
        this.id = id;
        this.teamLeader = null;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(ConsultantDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }
    
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
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
    
    public int numberOfPatients() {
        return this.patients.size();
    }
    
}
