import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

public class EmployeeRecordManagement {

    public static void main(String[] args) {
        ArrayList<String> employeeNames = new ArrayList<>();

        employeeNames.add("Rahul");
        employeeNames.add("Priya");
        employeeNames.add("Amit");
        employeeNames.add("Sneha");
        employeeNames.add("Rohit");
        TreeSet<Double> salaries = new TreeSet<>();
        salaries.add(50000.0);
        salaries.add(60000.0);
        salaries.add(45000.0);
        salaries.add(70000.0);
        salaries.add(55000.0);
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Rahul");
        employees.put(102, "Priya");
        employees.put(103, "Amit");
        employees.put(104, "Sneha");
        employees.put(105, "Rohit");
        System.out.println("Employee Names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
        System.out.println("\nEmployee Salaries in Ascending Order:");
        for (Double salary : salaries) {
            System.out.println(salary);
        }
        System.out.println("\nEmployee ID and Name:");
        for (Integer id : employees.keySet()) {
            System.out.println("Employee ID: " + id + ", Name: " + employees.get(id));
        }
        int searchId = 103;
        System.out.println("\nSearching for Employee ID: " + searchId);
        if (employees.containsKey(searchId)) {
            System.out.println("Employee Found: " + employees.get(searchId));
        } else {
            System.out.println("Employee Not Found");
        }
        System.out.println("\nAll Employee Records:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + " | Name: " + employees.get(id));
        }
    }
}