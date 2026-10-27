import java.util.*;
class car{
    String mn;
    double p;
    car(){
        this.mn = "Unknown";
        this.p = 0.0;
    }
    car(String modelname){
        mn = modelname;
        this.p =0.0;
    }
    car(String modelname, double price){
        mn = modelname;
        p = price;
    }
    void display(){
        System.out.println("Car Model: "+ mn+" | Price: Rs. "+p);

    }
}
public class ques4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        car c1 = new car();
        car c2 = new car(inp.next());
        car c3 = new car(inp.next(), inp.nextDouble());
        System.out.println("Details: ");
        c1.display();
        c2.display();
        c3.display();
    }
}