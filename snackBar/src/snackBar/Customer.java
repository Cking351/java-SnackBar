package snackBar;

public class Customer {
    private int maxId = 0;
    private int id;
    private String name;
    private double cashonHand;

    // Constructor
    public Customer(String name, double cashonHand) {
        maxId++;

        id = maxId;
        this.name = name;
        this.cashonHand = cashonHand;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashonHand;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCashOnHand(double cashonHand) {
        this.cashonHand = cashonHand;
    }

    // Other methods
    public void buySnack(double snackPrice) {
        cashonHand = cashonHand - snackPrice;
    }

    public void addCash(double cashToAdd) {
        cashonHand = cashonHand + cashToAdd;
    }
}