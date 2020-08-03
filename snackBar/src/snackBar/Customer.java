package snackBar;

public class Customer {
    private int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // Constructor
    public Customer(String name, double cashOnHand) {
        maxId++;

        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    // Other methods
    public void buySnack(double snackPrice) {
        this.cashOnHand = this.cashOnHand - snackPrice;
    }

    public void addCash(double cashToAdd) {
        this.cashOnHand = this.cashOnHand + cashToAdd;
    }
}