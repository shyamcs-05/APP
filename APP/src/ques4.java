import java.util.*;
class patient{
    String pname;
    double cfees;
    double discount;
    patient(String pname, double cfees){
        this.pname = pname;
        this.cfees = cfees;
    }
    double calfee(){
        if(cfees>=2000){
            return discount = cfees * 0.10;
        }
        else if(cfees<2000){
            return discount = cfees*0.05;
        }
        return 0.0;
    }
    void display(){
        System.out.printf("%-30s %-15.2f %-15.2f %-15.2f%n", pname, cfees, calfee(), (cfees-discount));
    }
}
public class ques4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        ArrayList<patient> p = new ArrayList<>();
        while(true){
            System.out.println("Enter the name of the patient: ");
            String pname = inp.next();
            System.out.println("Enter the consultation fees: ");
            double cfees = inp.nextDouble();
            p.add(new patient(pname, cfees));
            System.out.println("Do you want to add more patient records: ");
            String choice = inp.next();
            if(choice.equals("no")){
                break;
            }
        }
        System.out.println("Patient details: ");
        System.out.printf("%-30s %-15s %-15s %-15s%n","Name", "Fees", "Discount", "Final fee");
        for(patient pa: p){
            pa.display();
        }
    }
}