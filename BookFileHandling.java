import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BookFileHandling {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("book.txt");

            writer.write("Book ID: 201\n");
            writer.write("Book Author: Java Programming\n");
            writer.write("Author Name: James Gosling\n");
            writer.close();
            System.out.println("Book details written to file successfully.");
            FileReader reader = new FileReader("book.txt");
            int data;
            System.out.println("\nBook Details:");
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}