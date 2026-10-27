package patientmanagement;

public class patient {
    private int pid;
    private String pname;
    private String disease;
    private int age;
    public patient(int pid, String name, String disease, int age){
        this.pid = pid;
        this.pname = pname;
        this.disease =disease;
        this.age = age;
    }
    public int getpid(){
        return pid;
    }
    public String getpname(){
        return pname;
    }
    public String getdisease(){
        return disease;
    }
    public int getage(){
        return age;
    }
    public void displayp(){
        System.out.println("Patient details");
        System.out.println("Patient id: "+pid);
        System.out.println("Patiet name: "+pname);
        System.out.println("Disease: "+disease);
        System.out.println("Age: "+age);
    }
}