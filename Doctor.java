
package com.mycompany.doctor;



class Doctor {
    private int doctorID;
    private String name;
    private String specialization;
    private String availability;

    public Doctor(int doctorID, String name, String specialization, String availability) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAvailability() {
        return availability;
    }

    public void displayAvailability() {
        System.out.println("Doctor availability: " + availability);
    }
}

class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(int doctorID, String name, String availability) {
        super(doctorID, name, "General Practitioner", availability);
    }

    @Override
    public void displayAvailability() {
        System.out.println(getName() + " is available for walk-ins from " + getAvailability());
    }
}

class Specialist extends Doctor {
    public Specialist(int doctorID, String name, String specialization, String availability) {
        super(doctorID, name, specialization, availability);
    }

    @Override
    public void displayAvailability() {
        System.out.println(getName() + " requires appointments. Available slots: " + getAvailability());
    }
}

class Patient {
    private int patientID;
    private String name;

    public Patient(int patientID, String name, int age) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public void bookAppointment(Doctor doctor, Appointment appointment) {
        System.out.println("Appointment booked for " + name + " with Dr. " + doctor.getName());
    }
}

class Appointment {
    private int appointmentID;
    private int doctorID;
    private int patientID;
    private String date;
    private String time;

    public Appointment(int appointmentID, int doctorID, int patientID, String date, String time) {
        this.appointmentID = appointmentID;
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.date = date;
        this.time = time;
    }
}

public class main {
    public static void main(String[] args) {
        Doctor yunus = new GeneralPractitioner(1, "Dr. Yunus", "9 AM - 5 PM");
        Doctor mohammad = new Specialist(2, "Dr. Mohammad", "Cardiologist", "10 AM - 4 PM");
        Doctor golam  = new GeneralPractitioner(3, "Dr. Golam ", "8 AM - 2 PM");
        Doctor ali = new Specialist(4, "Dr. Ali", "Neurologist", "11 AM - 3 PM");
        Doctor shuvro = new GeneralPractitioner(5, "Dr. Shuvro", "12 PM - 6 PM");
        Doctor bushra = new Specialist(6, "Dr. Bushra", "Dermatologist", "9 AM - 12 PM");
        Doctor ayan = new GeneralPractitioner(7, "Dr. Ayan", "7 AM - 1 PM");
        Doctor tisha = new Specialist(8, "Dr. Tisha", "Pediatrician", "1 PM - 4 PM");
        Doctor julfikar = new GeneralPractitioner(9, "Dr. Julfikar", "8 AM - 5 PM");
        Doctor nabila = new Specialist(10, "Dr. Nabila", "Oncologist", "11 AM - 2 PM");
        Doctor rafid = new GeneralPractitioner(11, "Dr. Rafid", "9 AM - 5 PM");
        Doctor sarah = new Specialist(12, "Dr. Sarah", "Cardiologist", "10 AM - 4 PM");

        yunus.displayAvailability();
        mohammad.displayAvailability();
        golam .displayAvailability();
        ali.displayAvailability();
        shuvro.displayAvailability();
        bushra.displayAvailability();
        ayan.displayAvailability();
        tisha.displayAvailability();
        julfikar.displayAvailability();
        nabila.displayAvailability();
        rafid.displayAvailability();
        sarah.displayAvailability();

        Patient patient = new Patient(101, "Sultana", 30);
        Appointment appointment = new Appointment(1001, bushra.getDoctorID(), patient.getPatientID(), "2024-09-15", "10:00 AM");
        patient.bookAppointment(bushra, appointment);
    }
}

