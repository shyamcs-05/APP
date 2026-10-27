package doctormanagement;

public class doctor {
    private int did;
    private String name;
    private String spec;
    private double fees;
    public doctor(int did, String name, String spec, double fees){
        this.did = did;
        this.name = name;
        this.spec = spec;
        this.fees = fees;
    }
    public int getid(){
        return did;
    }
    public String getname(){
        return name;
    }
    public String getspec(){
        return spec;
    }
    public double getfee(){
        return fees;
    }
    public void displayd(){
        System.out.println("Doctor details");
        System.out.println("Doctor id: "+did);
        System.out.println("Doctor name: "+name);
        System.out.println("Specialization: "+spec);
        System.out.println("Consultation fees: "+ fees);
    }
}