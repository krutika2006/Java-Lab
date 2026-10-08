abstract class Employee {
    abstract void calculateBonus();
    void displayDetails() {
        System.out.println("Employee Bonus Details");
    }
}
class Manager extends Employee {
    @Override
    void calculateBonus() {
        System.out.println("Manager Bonus: Rs. 15000");
    }
}
class Developer extends Employee {
    @Override
    void calculateBonus() {
        System.out.println("Developer Bonus: Rs. 10000");
    }
}
public class EmployeeBonus {

    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();
        emp1.displayDetails();
        emp1.calculateBonus();
         System.out.println("--------------------------");
        emp2.displayDetails();
        emp2.calculateBonus();
    }
}