package snackBar;

public class Main {
    private static void workWithSnacks() {
        System.out.println("It's working!");
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vend1 = new VendingMachine("Food");
        VendingMachine vend2 = new VendingMachine("Drink");
        VendingMachine vend3 = new VendingMachine("Office");


        // (String name, int quantity, double cost, int machineId)
        Snack s1 = new Snack("Chips", 36, 1.75, vend1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vend1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vend1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, vend2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vend2.getId());

        // 1st section Customer 1 (Jane) buys 3 of snack 4 (Soda).
        c1.buySnack(s4.getTotalCost(3));
        s4.snacksBought(3);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

        System.out.println(" ");

        // 2nd section
        c1.buySnack(s3.getTotalCost(1));
        s3.snacksBought(1);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

        System.out.println(" ");

        // 3rd section
        c2.buySnack(s4.getTotalCost(2));
        s4.snacksBought(2);
        System.out.println("Customer 2 cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

        System.out.println(" ");

        // 4th section
        c1.addCash(10);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());

        System.out.println(" ");

        // 5th section
        c1.buySnack(s2.getTotalCost(1));
        s2.snacksBought(1);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());

        System.out.println(" ");

        // 6th section
        s3.addSnack(12);
        System.out.println("Quantity " + s3.getName() + " is " + s3.getQuantity());

        System.out.println(" ");

        // 7th section
        c2.buySnack(s3.getTotalCost(3));
        s3.snacksBought(3);
        System.out.println("Customer 2 cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity()); 
    }
    public static void main(String[] args) {
        workWithSnacks();
    }
}