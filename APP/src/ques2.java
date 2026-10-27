public class ques2 {
    static class OrderProcessing extends Thread {
        OrderProcessing() {
            super("OrderProcessing");
        }
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " | Priority: " + getPriority() + " | Processing order " + i);
            }
        }
    }
    static class DeliveryTracking extends Thread {
        DeliveryTracking() {
            super("DeliveryTracking");
        }
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " | Priority: "+ getPriority() + " | Tracking delivery " + i);
            }
        }
    }
    static class Notification extends Thread {
        Notification() {
            super("Notification");
        }
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " | Priority: " + getPriority() + " | Sending notification " + i);
            }
        }
    }
    public static void main(String[] args) {
        OrderProcessing order = new OrderProcessing();
        DeliveryTracking delivery = new DeliveryTracking();
        Notification notification = new Notification();
        order.setPriority(8);
        delivery.setPriority(5);
        notification.setPriority(3);
        order.start();
        delivery.start();
        notification.start();
    }
}