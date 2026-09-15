// written by naresh gupta
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
            System.out.println("\nList of Patients in Hospital: ");
            for(Patient p: patients) {
                System.out.println(p);
            }
            System.out.println();

            EmergencyQueue queue = hospital.getEmergencyQueue();

            //  Patient age statistics
            System.out.println("===== PATIENT AGE STATISTICS =====");

            System.out.println("Oldest Patient: " + PatientAgeStatistics.findOldest(patients));
            System.out.println("Youngest Patient: " + PatientAgeStatistics.findYoungest(patients));
            System.out.println("Average Age : " + PatientAgeStatistics.averageAge(patients));
            System.out.println();

            hospital.hospitalEmergencyReport();

            // Treatment Order
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