import java.util.*;
abstract class Shape{
    abstract double calculateArea();
}
class circle extends Shape{
    double radius;
    final double pi= 3.14;
    circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea(){
        return length*breadth;
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double calculateArea(){
        return 0.5*base*height;
    }
}
public class ques5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Shape shape = null;
        System.out.println("Enter your choice: ");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        int choice = inp.nextInt();
        switch(choice){
            case 1:
                System.out.print("\nEnter the radius: ");
                double radius = inp.nextDouble();
                shape = new circle(radius);
                break;
            case 2:
                System.out.print("\nEnter the length: ");
                double length = inp.nextDouble();
                System.out.print("\nEnter the breadth: ");
                double breadth = inp.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 3:
                System.out.print("\nEnter the base: ");
                double base = inp.nextDouble();
                System.out.print("\nEnter the height: ");
                double height = inp.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Enter invalid choice");
                break;
        }
        System.out.println("\nArea: "+shape.calculateArea());
    }
}