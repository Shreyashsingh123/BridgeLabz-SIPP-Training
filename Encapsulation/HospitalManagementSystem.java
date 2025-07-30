import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 1000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee + 200;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagementSystem {
    public static void processPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("Routine checkup completed.");
                System.out.println("Medical Records:");
                for (String rec : mr.viewRecords()) {
                    System.out.println("- " + rec);
                }
            }

            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient("P101", "Amit Kumar", 40, "Surgery", 5, 1500);
        patients[1] = new OutPatient("P102", "Sneha Shah", 30, "Flu", 500);

        processPatients(patients);
    }
}
