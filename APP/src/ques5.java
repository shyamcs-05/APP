import java.util.*;
class Ride{
    int no;
    String name;
    Ride(int no, String name){
        this.no = no;
        this.name = name;
    }
}
public class ques5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        ArrayList<Ride> r = new ArrayList<>();
        while(true){
            System.out.println("S.no: ");
            int no = inp.nextInt();
            inp.nextLine();
            System.out.println("Enter the ride name: ");
            String name = inp.nextLine();

            r.add(new Ride(no,name));
            System.out.println("Do you want to add more: ");
            String Choice = inp.next();
            if(Choice.equals("no")){
                break;
            }
        }
        for(Ride ri: r){
            System.out.print(ri.name+" :");
            for(int i=0;i<ri.no;i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}