import doctormanagement.doctor;
import patientmanagement.patient;
public class ques2 {
    public static void main(String[] args){
        doctor d1= new doctor(101, "Doctor1","cardio",1000);
        doctor d2 = new doctor(102, "Doctor2","Bone", 1200);
        patient p1 = new patient(201, "Patient1", "Heart disease", 45);
        patient p2 = new patient(202, "Patient2", "Fracture", 33);
        doctor assignd1= d1;
        doctor assignd2 = d2;
        doctor assignd3 = d1;
        System.out.println("Patient1 details");
        p1.displayp();
        System.out.println("Doctor treating the patient: ");
        assignd1.displayd();
        System.out.println("Patient2 details");
        p2.displayp();
        System.out.println("Doctor treating the patient: ");
        assignd2.displayd();
        int d1patients = 1;
        int d2patients = 2;
        double totalfeed1 = d1patients*d1.getfee();
        double totalfeed2 = d2patients*d2.getfee();
        System.out.println("Consultation fees");
        System.out.println(d1.getname()+totalfeed1);
        System.out.println(d2.getname()+totalfeed2);
    }
}