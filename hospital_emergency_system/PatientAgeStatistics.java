// written by harsh
package hospital_emergency_system;

import java.util.List;


class PatientAgeStatistics {

    public static Patient findOldest(List<Patient> patients) {
        validatePatients(patients);
        Patient oldest = patients.get(0);
        for (Patient p : patients) {
            if (p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest;
    }

    public static Patient findYoungest(List<Patient> patients) {
        validatePatients(patients);
        Patient youngest = patients.get(0);
        for (Patient p : patients) {
            if (p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }
        return youngest;
    }

    public static double averageAge(List<Patient> patients) {
        validatePatients(patients);
        int totalAge = 0;
        for (Patient p : patients) {
            totalAge += p.getAge();
        }
        return (double) totalAge / patients.size();
    }

    private static void validatePatients(List<Patient> patients) {
        if (patients == null || patients.isEmpty()) {
            throw new IllegalArgumentException(
                    "Patient list cannot be null or empty."
            );
        }
    }
}