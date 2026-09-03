package hospital_emergency_system;


import java.util.List;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        HospitalService hospital = new HospitalService();

        try {

            hospital.addPatient(new Patient(101, "Rahul", 45, 2, 1));
            hospital.addPatient(new Patient(102, "Amit", 25, 1, 2));
            hospital.addPatient(new Patient(103, "Priya", 60, 3, 3));
            hospital.addPatient(new Patient(104, "Neha", 30, 1, 4));
            hospital.addPatient(new Patient(105, "Rohit", 50, 2, 5));

            List<Patient> patients = hospital.getPatients();
            EmergencyQueue queue = hospital.getEmergencyQueue();

            // Statistics
            System.out.println("===== PATIENT STATISTICS =====");

            System.out.println("Oldest Patient: " + PatientStatistics.findOldest(patients));
            System.out.println("Youngest Patient: " + PatientStatistics.findYoungest(patients));
            System.out.println("Average Age: " + PatientStatistics.averageAge(patients));

            hospital.hospitalEmergencyReport();

           // Next Patient
            System.out.println("\n===== EMERGENCY QUEUE =====");
            System.out.println("Next Patient: " + queue.peekNextPatient());

            // Treatment
            System.out.println("\n===== TREATMENT ORDER =====");
            while (!queue.isEmpty()) {
                Patient patient = queue.treatNextPatient();
                System.out.println("Treating: " + patient);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}