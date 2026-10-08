import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<String> bookNames = new ArrayList<>();
        bookNames.add("Java Programming");
        bookNames.add("Python Basics");
        bookNames.add("Database Management");
        bookNames.add("Computer Networks");
        bookNames.add("Data Structures");
        TreeSet<Double> prices = new TreeSet<>();
        prices.add(450.0);
        prices.add(300.0);
        prices.add(550.0);
        prices.add(400.0);
        prices.add(350.0);
        HashMap<Integer, String> books = new HashMap<>();
        books.put(201, "Java Programming");
        books.put(202, "Python Basics");
        books.put(203, "Database Management");
        books.put(204, "Computer Networks");
        books.put(205, "Data Structures");
        System.out.println("Book Names:");
        for (String book : bookNames) {
            System.out.println(book);
        }
        System.out.println("\nBook Prices in Sorted Order:");
        for (Double price : prices) {
            System.out.println(price);
        }
        System.out.println("\nBook ID and Title:");
        for (Integer id : books.keySet()) {
            System.out.println("Book ID: " + id + ", Title: " + books.get(id));
        }
        int searchId = 203;

        System.out.println("\nSearching for Book ID: " + searchId);

        if (books.containsKey(searchId)) {
            System.out.println("Book Found: " + books.get(searchId));
        } else {
            System.out.println("Book Not Found");
        }
        System.out.println("\nAll Book Information:");
        for (Integer id : books.keySet()) {
            System.out.println("ID: " + id + " | Title: " + books.get(id));
        }
    }
}