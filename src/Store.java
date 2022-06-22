
import java.util.HashMap;
import java.util.Stack;

public class Store {

    // Customer: purchase, cartGoods
    // Staff: pickStaff
    private Staff myStaff;
    private Customers myCustomers;
    private Products myProducts;



    public Store(Staff myStaff, Customers myCustomers, Products myProducts) {
        this.myStaff = myStaff;
        this.myCustomers = myCustomers;
        this.myProducts = new Products();
    }

    //create methods
//    public void customerHistory() {
//        System.out.println("Customer history: ");
//        System.out.println("Id: " + myCustomers.getId());
//        myCustomers.cartGoods();
//        myCustomers.purchase(200);
//    }

    public void makeSales (String name) {
        myProducts.sell(name);
    }



    public HashMap reStock(String name, Double price) {
        HashMap stock = myProducts.stock(name,price);
        return stock;
    }




}
