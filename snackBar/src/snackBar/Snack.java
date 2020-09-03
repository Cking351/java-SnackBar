package snackBar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    // Constructor
    public Snack(String name, int quantity, double cost, int machineId) {
        maxId++;

        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getMachineId() {
        return machineId;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    // Other methods
    public void addSnack(int added) {
        this.quantity = this.quantity + added;
    }

    public void snacksBought(int boughtQuantity) {
        this.quantity = this.quantity - boughtQuantity;
    }

    public double getTotalCost(int amount) {
        return amount * this.cost;
    }
}