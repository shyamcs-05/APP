package src;

import java.util.Scanner;
public class ques4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int l = inp.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b = inp.nextInt();
        Rectangle rec = new Rectangle(l,b);
        rec.cal();
    }
}
class Rectangle{
    int l;
    int b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    void cal(){
        int area = l*b;
        System.out.println("The area of rectangle of length "+l+" and breadth "+b+" is "+area);
    }
}