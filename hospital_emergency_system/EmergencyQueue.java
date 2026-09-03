// written by rihan
package hospital_emergency_system;

import java.util.PriorityQueue;
import java.util.Queue;

class EmergencyQueue {

    private final Queue<Patient> queue;

    public EmergencyQueue() {
        queue = new PriorityQueue<>(new PatientComparator());
    }

    // Add patient
    public void addPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }
        queue.offer(patient);
    }

    // Treat highest-priority patient
    public Patient treatNextPatient() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("No patients available for treatment.");
        }
        return queue.poll();
    }

    // View highest-priority patient
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("No patients available in the queue.");
        }
        return queue.peek();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}