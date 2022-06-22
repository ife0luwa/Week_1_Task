import java.util.*;

public class Main {
        private static Scanner input = new Scanner(System.in);
        private static Staff myStaff = randomStaff();
        private static Staff headStaff = new Manager();
        private static Customers myCustomers = new Customers();
        private static Products myProducts = new Products();
        private static Store myStore = new Store(myStaff, myCustomers, myProducts);
        record uniqueStaff (String name, int age, String gender) {}
        private static Set<uniqueStaff> staffL = new HashSet<>();
        private static HashMap<String,Double> stock;


    public static void main(String[] args) {
        System.out.println("\n" + "**** Welcome to the koorius Store ****");
                boolean quit = false;
                int choice = 0;
                printInstructions();
                while (quit == false) {
                    System.out.print("Enter your choice: " );
                    choice = input.nextInt();
                    System.out.println();
                    switch (choice) {
                        case 0:
                            printInstructions();
                            System.out.println();
                            break;
                        case 1:
                            printStaff();
                            break;
                        case 2:
                            reStock();
                            break;
                        case 3:
                            checkStock();
                            System.out.println();
                            break;
                        case 4:
                            sellProducts();
                            System.out.println();
                            break;
                        case 5:
                            hireStaff();
                            break;
                        case 6:
                            quit = true;
                    }
                }
    }















    public static Staff randomStaff () {
        int rand = (int) (Math.random() * 2) +1;
        //System.out.println("Staff list:");
        switch (rand) {
            case 1:
                return new Manager();
            case 2:
                return new Cashier();
            default:
                return null;
        }
    }

    public static void checkStock () {
        if(stock != null)  {
            Set<String> cartItems = stock.keySet();
            for (String everyItem : cartItems) {
                Collection<Double> pricey = stock.values();
                for (Double everyPrice : pricey) {
                    System.out.println("*** Current Stock  ***" + "\n" + "Product:" + everyItem + "\t" + "price:" + everyPrice);
                }
                //break;
            }
        } else
            System.out.println("Stock is empty. Restock!");
    }

    public static void reStock () {
        System.out.print("How many(0 - 9) items do you want to restock: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter product no." + (i + 1) + " name:");
            String name = input.next();
            System.out.print("Enter products no." + (i + 1) + " price:" );
            Double price = input.nextDouble();
            stock = myStore.reStock(name, price);
        }
        Set<String> cartItems = stock.keySet();
        System.out.println("\n" + "* * * Stock Updated with * * *" );
        for (String everyItem : cartItems) {
            Collection<Double> pricey = stock.values();
            for(Double everyPrice : pricey) {
                System.out.println("Product:" + everyItem + "\t" + "price:" + everyPrice );
            }
            //break;

        }
            System.out.println("\t" + "  * * * * * *" + "\t" + "\n");
    }

    public static void printInstructions () {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print options");
        System.out.println("\t 1 - To print staff list");
        System.out.println("\t 2 - To restock the store");
        System.out.println("\t 3 - To check current stock");
        System.out.println("\t 4 - To make sales");
        System.out.println("\t 5 - To hire new staff" + "\n");
        System.out.println("\t 6 - To quit the application" + "\n");
    }

    public static void hireStaff () {
        System.out.print("Enter new staff member name: ");
        String name = input.next();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter gender: ");
        String gender = input.next();
        headStaff.hire(name,age,gender);
        System.out.println();

        staffL.add(new uniqueStaff(name, age, gender));
        System.out.println("**** New staff member hired ****" + "\n" +staffL);
    }

    public static void printStaff () {
        if(staffL != null) {
            System.out.println("*** Koorius Store current Staff List ***");
            for (uniqueStaff eachStaff : staffL) {
                System.out.println(eachStaff + "\n");
            }
        } else {
            System.out.println("*** No new staff yet ***" + "\n" +
                               "press 5 to hire new staff");
        }
    }

    public static void sellProducts () {
        System.out.print("Enter the product name you wish to sell: ");
        String name = input.next();
        myStore.makeSales(name);
    }

    public static void printReceipt () {

    }
}
