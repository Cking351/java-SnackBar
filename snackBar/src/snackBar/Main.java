package snackBar;

public class Main {
    private static void workWithSnacks() {
        System.out.println("It's working!");
        Customer c1 = new Customer("Customer 1", 37.75);
        Customer c2 = new Customer("Customer 2", 28.14);

        VendingMachine vend1 = new VendingMachine("Drink");
        VendingMachine vend2 = new VendingMachine("Food");
        VendingMachine vend3 = new VendingMachine("Office");


        // (String name, int quantity, double cost, int machineId)
        Snack s1 = new Snack("Snack 1", 12, 1.75, vend1.getId());
        Snack s2 = new Snack("Snack 2", 36, 1.00, vend2.getId());
        Snack s3 = new Snack("Snack 3", 30, 2.00, vend1.getId());
        Snack s4 = new Snack("Snack 4", 21, 2.00, vend2.getId());

        // 1st section - baseline for customer 1
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

        System.out.println(" ");

        // 2nd section
        c1.buySnack(s3.getCost());
        s3.buySnack(1);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

        System.out.println(" ");

        // 3rd section - baseline for customer 2
        System.out.println("Customer 2 cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

        System.out.println(" ");

        // 4th section
        c1.addCash(10);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());

        System.out.println(" ");

        // 5th section
        c1.buySnack(s2.getCost());
        s2.buySnack(1);
        System.out.println("Customer 1 cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());

        System.out.println(" ");

        // 6th section
        s3.addSnack(12);
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());

        System.out.println(" ");

        // 7th section
        c2.buySnack(s3.getCost());
        s3.buySnack(1);
        System.out.println("Customer 1 cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s2.getQuantity()); 
    }
    public static void main(String[] args) {
        workWithSnacks();
    }
}