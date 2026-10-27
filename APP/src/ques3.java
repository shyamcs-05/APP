import java.util.*;
class Task implements Runnable{
    private String activity;
    private int interval;
    Task(String activity, int interval){
        this.activity = activity;
        this.interval = interval;
    }
    public void run(){
        for(int i =1;i<=3;i++){
            try{
                System.out.println(Thread.currentThread().getName()+":"+activity);
                Thread.sleep(interval);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class ques3 {
    public static void main(String[] args){
        Task timer = new Task("Displaying remaining time", 1000);
        Task autosave = new Task("AutoSaving students answers",2000);
        Task network = new Task("Checking network connection", 1500);
        Thread t1 = new Thread(timer);
        Thread t2 = new Thread(autosave);
        Thread t3 = new Thread(network);
        t1.setName("Timer Thread");
        t2.setName("Autosave Thread");
        t3.setName("Network thread");
        t1.start();
        t2.start();
        t3.start();
    }
}