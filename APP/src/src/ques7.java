package src;

import java.util.*;
class Marks{
    int m1;
    int m2;
    int m3;
    int total;
    int avg;
    Marks(int mark1, int mark2, int mark3){
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
        total = m1+m2+m3;
        avg = (m1+m2+m3)/3;
    }
    void display(){
        System.out.println("The total marks obtained is: "+total);
        System.out.println("The average mark is: "+avg);
    }
}
public class ques7 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int mark1  = inp.nextInt();
        int mark2 = inp.nextInt();
        int mark3 = inp.nextInt();
        Marks m = new Marks(mark1, mark2, mark3);
        m.display();
    }
}