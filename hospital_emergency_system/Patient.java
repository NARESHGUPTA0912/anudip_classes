package hospital_emergency_system;

// designed by Naresh Gupta
final class Patient {

    private final int patientId;
    private String name;
    private int age;
    private int emergencyLevel;
    private final int arrivalNumber;

    public Patient(int patientId, String name, int age,
                   int emergencyLevel, int arrivalNumber) {

        // Patient ID validation
        if (patientId <= 0) {
            throw new IllegalArgumentException(
                    "Patient ID must be greater than 0."
            );
        }

        // Arrival number validation
        if (arrivalNumber <= 0) {
            throw new IllegalArgumentException(
                    "Arrival number must be greater than 0."
            );
        }

        this.patientId = patientId;
        this.arrivalNumber = arrivalNumber;

        // Use setters for mutable fields
        setName(name);
        setAge(age);
        setEmergencyLevel(emergencyLevel);
    }

    // Getters

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmergencyLevel() {
        return emergencyLevel;
    }

    public int getArrivalNumber() {
        return arrivalNumber;
    }

    // Setters

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Patient name cannot be null, empty or blank."
            );
        }
        this.name = name.trim();
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Age cannot be negative."
            );
        }
        this.age = age;
    }

    public void setEmergencyLevel(int emergencyLevel) {
        if (emergencyLevel < 1 || emergencyLevel > 3) {
            throw new IllegalArgumentException(
                    "Emergency level must be between 1 and 3."
            );
        }
        this.emergencyLevel = emergencyLevel;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + patientId +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Emergency Level=" + emergencyLevel +
                ", Arrival Number=" + arrivalNumber +
                '}';
    }
}
