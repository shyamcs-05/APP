package src;

import java.util.*;
class Temperature{
    double te;
    double fahrenheit;
    Temperature(double temp){
        te =temp;
        fahrenheit = ((9.0/5.0)*te)+32;
    }
    void display(){
        System.out.println("Temperature in celsius: "+te);
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
    }
}
public class ques8 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        double temp = inp.nextDouble();
        Temperature t = new Temperature(temp);
        t.display();
    }
}