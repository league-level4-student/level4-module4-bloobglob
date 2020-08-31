package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	void addPatient(Patient p) {
		patients.add(p);
	}
	ArrayList<Patient> getPatients(){
		return patients;
	}
	void assignPatientsToDoctors() {
		int counter = 0;
		for(int i = 0; i < patients.size(); i++) {
			System.out.println(counter);
			try {
				doctors.get(counter).assignPatient(patients.get(i));
			}catch(DoctorFullException dfe){
				i--;
				counter++;
			}
		}
	}
}
