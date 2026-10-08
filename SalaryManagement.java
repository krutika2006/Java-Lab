class Employee {
    void calculateSalary() {
        System.out.println("Employee salary details");
    }
}
class Manager extends Employee {
    @Override
    void calculateSalary() {
        double basicSalary = 60000;
        double bonus = 10000;
        double totalSalary = basicSalary + bonus;

        System.out.println("Manager Salary Details");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("--------------------------");
    }
}
class Programmer extends Employee {
    @Override
    void calculateSalary() {
        double basicSalary = 50000;
        double bonus = 5000;
        double totalSalary = basicSalary + bonus;

        System.out.println("Programmer Salary Details");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("--------------------------");
    }
}
public class SalaryManagement {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Programmer();
        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}