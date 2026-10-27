import java.util.*;
abstract class Product{
    int productID;
    String name;
    double price;
    Product(int productID, String name, double price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }
    abstract double calculateDiscount();
    double finalprice(){
        return price - calculateDiscount();
    }
    void display(){
        System.out.println("ID: "+productID);
        System.out.println("Name: "+name);
        System.out.println("Final price: "+finalprice());
    }
}
class Electronics extends Product{
    double discount;
    Electronics(int productID, String name, double price, double discount){
        super(productID, name, price);
        this.discount = discount;
    }
    double calculateDiscount() {
        return (price*discount/100);
    }
    double finalprice(){
        return price - calculateDiscount();
    }
}
class Clothing extends Product{
    double discount;
    Clothing(int productID, String name, double price, double discount){
        super(productID, name, price);
        this.discount = discount;
    }
    double calculateDiscount() {
        return (price*discount/100);
    }
    double finalprice(){
        return price - calculateDiscount();
    }
}
class Books extends Product{
    double discount;
    Books(int productID, String name, double price, double discount){
        super(productID, name, price);
        this.discount = discount;
    }
    double calculateDiscount(){
        return (price*discount/100);
    }
    double finalprice(){
        return price - calculateDiscount();
    }
}
public class ques4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        ArrayList<Product> p = new ArrayList<>();
        System.out.println("Enter the details for electronics: ");
        p.add(new Electronics(inp.nextInt(), inp.next(), inp.nextDouble(), inp.nextDouble()));
        System.out.println("Enter the details for Clothing: ");
        p.add(new Clothing(inp.nextInt(), inp.next(), inp.nextDouble(), inp.nextDouble()));
        System.out.println("Enter the details for Books: ");
        p.add(new Books(inp.nextInt(), inp.next(), inp.nextDouble(), inp.nextDouble()));
        double totalprice = 0;
        for(Product pr:p){
            pr.display();
            totalprice =totalprice+pr.finalprice();
        }
        System.out.println("Total price: "+totalprice);
    }
}