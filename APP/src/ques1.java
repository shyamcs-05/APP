public class ques1 {
    static class EmergencyAlert extends Thread {
        public EmergencyAlert() {
            super("EmergencyAlert");
        }
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " | Priority: "+ getPriority() + " | Critical alert " + i);
            }
        }
    }
    static class VitalMonitor extends Thread {
        public VitalMonitor() {
            super("VitalMonitor");
        }
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " | Priority: "+ getPriority() + " | Checking vital signs " + i);
            }
        }
    }
    static class ReportGenerator extends Thread {
        public ReportGenerator() {
            super("ReportGenerator");
        }
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " | Priority: "+ getPriority() + " | Preparing report " + i);
            }
        }
    }
    public static void main(String[] args) {
        EmergencyAlert emergency = new EmergencyAlert();
        VitalMonitor vital = new VitalMonitor();
        ReportGenerator report = new ReportGenerator();
        emergency.setPriority(Thread.MAX_PRIORITY);
        vital.setPriority(Thread.NORM_PRIORITY);
        report.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread priorities:");
        System.out.println(emergency.getName() + " = " + emergency.getPriority());
        System.out.println(vital.getName() + " = " + vital.getPriority());
        System.out.println(report.getName() + " = " + report.getPriority());
        emergency.start();
        vital.start();
        report.start();
    }
}