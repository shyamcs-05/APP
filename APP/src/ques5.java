import java.util.*;
class area{
    double calarea(double side){
        return side*side;
    }
    double calarea(double l, double b){
        return l*b;
    }
    double calarea(double r, boolean iscircle){
        if(iscircle){
            return 3.14*r*r;
        }
        return 0;
    }
}
public class ques5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double side = inp.nextDouble();
        area a = new area();
        double sarea = a.calarea(side);
        double l = inp.nextDouble();
        double b = inp.nextDouble();
        double rarea = a.calarea(l,b);
        double r = inp.nextDouble();
        double carea = a.calarea(r, true);
        System.out.println("The area of square is: "+sarea);
        System.out.println("The area of rectangle is: "+rarea);
        System.out.println("The area of circle is: "+carea);
    }
}