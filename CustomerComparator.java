import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        // Compare by First Name
        int firstNameCompare = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
        if (firstNameCompare != 0) return firstNameCompare;

        // Compare by Last Name
        int lastNameCompare = c1.getLastName().compareToIgnoreCase(c2.getLastName());
        if (lastNameCompare != 0) return lastNameCompare;

        // Compare by ID
        int idCompare = Integer.compare(c1.getId(), c2.getId());
        if (idCompare != 0) return idCompare;

        // Compare by Balance
        return Double.compare(c1.getBalance(), c2.getBalance());
    }
}

