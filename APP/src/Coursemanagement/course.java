package Coursemanagement;

public class course {
    String cname;
    String ccode;
    int credits;
    public course(String cname, String ccode, int credits){
        this.cname = cname;
        this.ccode = ccode;
        this.credits = credits;
    }
    public void displayc(){
        System.out.println("Course details");
        System.out.println("Course name: "+cname);
        System.out.println("Course code: "+ccode);
        System.out.println("Credits: "+credits);
    }
}