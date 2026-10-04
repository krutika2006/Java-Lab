//Design an Employee class with attributes EmployeeId, EmployeeName, and Salary. Initialize the data using a constructor and create a method to display the employee information. Create two Employee objects and display their details.
class Employee {
    int employeeId;
    String employeeName;
    double salary;
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee(101, "Rahul", 50000);
        Employee emp2 = new Employee(102, "Priya", 60000);
        emp1.displayInfo();
        emp2.displayInfo();
    }
}