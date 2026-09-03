package hospital_emergency_system;

import java.util.Comparator;

class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {

        int emergencyComparison = Integer.compare(
                p1.getEmergencyLevel(),
                p2.getEmergencyLevel()
        );

        if (emergencyComparison != 0) {
            return emergencyComparison;
        }

        return Integer.compare(
                p1.getArrivalNumber(),
                p2.getArrivalNumber()
        );
    }
}