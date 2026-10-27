package src;

import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of entries: ");
        int n = inp.nextInt();
        String[] title = new String[n];
        String[] author = new String[n];
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the title of the book"+(i+1)+": ");
            title[i] = inp.next();
            System.out.print("\nEnter the author of the books"+(i+1)+": ");
            author[i] = inp.next();
            System.out.print("\nEnter the price of the books"+(i+1)+": ");
            price[i] = inp.nextInt();
        }
        books b = new books(title , author, price, n);
        b.display();
    }
}
class books{
    int n;
    String[] t;
    String[] a;
    int[] p;
    books(String[] title, String[] author, int[] price, int n){
        this.n = n;
        t = new String[n];
        a = new String[n];
        p = new int[n];
        for(int i=0;i<n;i++){
            t[i] = title[i];
            a[i] = author[i];
            p[i] = price[i];
        }
    }
    void display(){
        for(int i=0;i<n;i++){
            System.out.println("Details of Book"+(i+1));
            System.out.println("Title: "+t[i]);
            System.out.println("Author: "+a[i]);
            System.out.println("Price: "+p[i]);
        }
    }

}