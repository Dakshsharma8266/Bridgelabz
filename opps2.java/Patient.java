import java.util.*;

class Patient {
    private String name;
    public Patient(String name){ this.name = name; }
    public String getName(){ return name; }
}

class Doctor {
    private String name;
    public Doctor(String name){ this.name = name; }
    public void consult(Patient p){
        System.out.println("Doctor " + name + " consulted " + p.getName());
    }
    public String getName(){ return name; }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    public Hospital(String name){ this.name = name; }
    public void addDoctor(Doctor d){ doctors.add(d); }
    public void addPatient(Patient p){ patients.add(p); }
    public void show(){
        System.out.println("Hospital: " + name);
        for(Doctor d: doctors){ System.out.println("Doctor: " + d.getName()); }
        for(Patient p: patients){ System.out.println("Patient: " + p.getName()); }
    }
}

public class HospitalSystem {
    public static void main(String[] args){
        Hospital h = new Hospital("Apollo");
        Doctor d1 = new Doctor("Dr. A");
        Doctor d2 = new Doctor("Dr. B");
        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Sneha");
        h.addDoctor(d1); h.addDoctor(d2);
        h.addPatient(p1); h.addPatient(p2);
        h.show();
        d1.consult(p1);
        d2.consult(p2);
    }
}
