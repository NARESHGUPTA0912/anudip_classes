// written by Naresh Gupta and harsh
package hospital_emergency_system;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HospitalService {

    private final List<Patient> patients;
    private final Set<Integer> patientIds;
    private final EmergencyQueue emergencyQueue;

    public HospitalService() {
        patients = new ArrayList<>();
        patientIds = new HashSet<>();
        emergencyQueue = new EmergencyQueue();
    }

    public void addPatient(Patient patient) {

        if (patient == null) {
            throw new IllegalArgumentException(
                    "Patient cannot be null."
            );
        }

        if (!patientIds.add(patient.getPatientId())) {
            throw new IllegalArgumentException(
                    "Patient ID cannot be duplicated."
            );
        }

        patients.add(patient);
        emergencyQueue.addPatient(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public EmergencyQueue getEmergencyQueue() {
        return emergencyQueue;
    }


    public void hospitalEmergencyReport() {
        int critical = 0;
        int serious = 0;
        int normal = 0;
        for (Patient patient : patients) {
            switch (patient.getEmergencyLevel()) {
                case 1 -> critical++;
                case 2 -> serious++;
                case 3 -> normal++;
            }
        }

        System.out.println("\n===== PATIENT Emergency Report =====");
        System.out.println("Critical Patients: " + critical);
        System.out.println("Serious Patients: " + serious);
        System.out.println("Normal Patients: " + normal);
        System.out.println("Total Patients: " + patients.size());

        System.out.println("\n===== EMERGENCY QUEUE =====");
        System.out.println("Next Patient: " + emergencyQueue.peekNextPatient());
    }
}