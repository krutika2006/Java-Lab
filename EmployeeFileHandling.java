import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeFileHandling {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee ID: 101\n");
            writer.write("Employee Name: Rahul\n");
            writer.write("Department: Sales\n");
            writer.write("Salary: 50000\n");
            writer.close();
            System.out.println("Employee details written to file successfully.");
             FileReader reader = new FileReader("employee.txt");
             int data;
             System.out.println("\nEmployee Details:");

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}