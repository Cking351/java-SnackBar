package snackBar;

public class VendingMachine {
    private static int maxId = 0;

    private int id;
    private String name;

    // Constructor
    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
}