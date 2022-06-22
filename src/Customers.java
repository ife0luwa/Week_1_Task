public class Customers implements IStaffDuties {
    private String id;
    private int age;
    private String gender;
    private String cartItems;
    private int bill;


//create a constructor
    public Customers() {
        this.id = "A024";
        this.age = 24;
        this.gender = "Male";
        this.cartItems = "Grocery, utensils, clothes";
    }

    public Customers(String id, int age, String gender, String cartItems, int bill) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.cartItems = cartItems;
        this.bill = bill;
    }


//override methods
    @Override
    public void purchase(double bill) {
        //int bill = getBill();
        System.out.println("Customer bought products worth $" + bill);
    }


    public void cartGoods () {
        System.out.println("Purchase list: Grocery, utensils, clothes");
    }

//create getters
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String cartItems() {
        return cartItems;
    }

    public int getBill() {
        return bill;
    }
}
