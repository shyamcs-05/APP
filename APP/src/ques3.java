import java.util.*;
class Employee {
    int employeeID;
    String name;
    double monthlySalary;
    Employee(int employeeID, String name, double monthlySalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
    public boolean isEligibleForBonus() {
        return monthlySalary >= 30000;
    }
    public double calculateBonus() {
        if (isEligibleForBonus()) {
            return calculateAnnualSalary() * 0.10;
        }
        return 0.0;
    }
    public void displayEmployeeDetails() {
        double annualSalary = calculateAnnualSalary();
        double bonus = calculateBonus();
        String eligibility = isEligibleForBonus() ? "Eligible" : "Not Eligible";
        System.out.printf("%-15d %-20s %-15.2f %-15.2f %-12.2f %-12s%n", employeeID, name, monthlySalary, annualSalary, bonus, eligibility);
    }
}
public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        System.out.println("--- Enter Details for Employees ---");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEntering details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Monthly Salary (₹): ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employeeList.add(new Employee(id, name, salary));
        }
        System.out.println("\n============================================ EMPLOYEE REPORT ============================================");
        System.out.printf("%-15s %-20s %-15s %-15s %-12s %-12s%n",
                "Employee ID", "Name", "Monthly Sal(₹)", "Annual Sal(₹)", "Bonus(₹)", "Status");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (Employee emp : employeeList) {
            emp.displayEmployeeDetails();
        }
        scanner.close();
    }
}