import java.util.*;
class product{
    int pid;
    String pname;
    double price;
    double quantity;
    double total;
    product(int pid, String pname, double price, double quantity){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }
    double caltotal(){
        return total = price*quantity;
    }
    double caldis(){
        if(total>=5000){
            return total*0.10;
        }
        else{
            return total*0.05;
        }
    }
    void display(){
        double totalprice = caltotal();
        double discount = caldis();
        double finalprice = totalprice -discount;
        System.out.println("ProductID: "+pid);
        System.out.println("Name: "+pname);
        System.out.println("discount: "+discount);
        System.out.println("Final price: "+finalprice);
    }

}
public class ques1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        ArrayList<product> p = new ArrayList<>();
        while(true){
            System.out.println("Enter the details: ");
            System.out.println("Enter the id: ");
            int id = inp.nextInt();
            inp.nextLine();

            System.out.println("Enter the name: ");
            String name = inp.next();
            inp.nextLine();

            System.out.println("Enter the price: ");
            double price = inp.nextDouble();

            System.out.println("Enter the quantity: ");
            double quantity = inp.nextDouble();

            p.add(new product(id, name, price, quantity));
            System.out.println("Enter your choice: ");
            String choice = inp.next();
            if(choice.equals("no")){
                break;
            }
        }
        for(product pr: p){
            pr.display();
        }
    }
}