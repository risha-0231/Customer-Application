public class Customer {
    private int id;
    private double balance;
    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(int id, double balance, String firstName, String lastName) {
        this.id = id;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Override toString for better display
    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Balance=" + balance +
                ", First Name=" + firstName + ", Last Name=" + lastName + "]";
    }
}
