class BTask implements Runnable {
    private String activity;
    private int delay;
    BTask(String activity, int delay){
        this.activity = activity;
        this.delay = delay;
    }
    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println(Thread.currentThread().getName() + " - " + activity + " - Execution Count: " + count);
            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ques4{
    public static void main(String[] args){
        BTask transaction = new BTask("Transaction Processing", 1000);
        BTask balance = new BTask("Balance Updating", 1500);
        BTask sms = new BTask("SMS Notification", 2000);
        Thread t1 = new Thread(transaction);
        Thread t2 = new Thread(balance);
        Thread t3 = new Thread(sms);
        t1.setName("Transaction Thread");
        t2.setName("Balance Thread");
        t3.setName("SMS Thread");
        t1.start();
        t2.start();
        t3.start();
    }
}