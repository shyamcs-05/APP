class vehicle{
    String vehicleNumber,brand;
    int speed;
    vehicle(String vehicleNumber,String brand,int speed){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
        this.speed=speed;
    }
    void display(){
        System.out.println("Vehicle Number : "+vehicleNumber);
        System.out.println("Brand : "+brand);
        System.out.println("speed : "+speed); }
}
class car extends vehicle{
    int numberofdoors;
    car(String vehicleNumber,String brand,int speed,int numberofdoors){
        super(vehicleNumber,brand,speed);
        this.numberofdoors=numberofdoors;
    }
    void display(){
        super.display();
        System.out.println("no of doors : "+numberofdoors);
    }
}
class bike extends vehicle{
    boolean hasgear;
    bike(String vehicleNumber,String brand,int speed,boolean hasgear){
        super(vehicleNumber,brand,speed);
        this.hasgear=hasgear;
    }
    void display(){
        super.display();
        System.out.println("has gear : "+hasgear);
    }

}
public class ques1{
    static void main(String[] args) {
        vehicle v1=new car("TN11AS1234","swift",120,4);
        vehicle v2=new bike("JK03RE4564","hunter",150,true);
        v1.display();
        v2.display();
    }
}