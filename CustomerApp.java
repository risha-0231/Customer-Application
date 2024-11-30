import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerApp {
    public static void main(String[] args) {
        // Create a list of customers
        List<Customer> customers = new ArrayList<>();

        // Add customers to the list
        customers.add(new Customer(101, 5000.50, "Alice", "Brown"));
        customers.add(new Customer(102, 3000.75, "Bob", "Smith"));
        customers.add(new Customer(103, 7000.00, "Alice", "Smith"));
        customers.add(new Customer(104, 3000.75, "Alice", "Brown")); // Same as first for testing

        // Sort the list using the custom comparator
        Collections.sort(customers, new CustomerComparator());

        // Print sorted list
        System.out.println("Sorted Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
