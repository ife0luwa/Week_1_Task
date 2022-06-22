import java.util.HashMap;

public class Products {


    private HashMap<String, Double> productInfo;


//create a constructor


    public Products() {
        this.productInfo = new HashMap<>();
    }

    //create methods
    public void sellOut () {
            System.out.println("this product is out of stock");
    }

    public void discount (String name) {
        System.out.println(name + " is up for a %10 discount");
    }



    //methods
    public HashMap stock (String name, Double price) {
        productInfo.put(name, price);
        return productInfo;
    }

    public HashMap sell (String name) {
        if(productInfo.containsKey(name)) {
            System.out.println("\t" + " koorius store " + "\t" + "\n" +
                     "* * * * * * * * * * * * * *" + "\n" +
                    "\t" + "\t" + "cash receipt " + "\t" + "\n" +
                    "* * * * * * * * * * * * * *" + "\n" +
                     "description" + "\t" + "\t" + "price" + "\t" + "\n" +
                    "\t" + name + "\t" + "\t" + productInfo.get(name) + "\t" +"\n" + "\n" +
                     "\t" + "\t" + "thank you" + "\t" + "\t" );
        productInfo.remove(name);
        } else {
            System.out.println("Product is out of stock!");
        }
        return productInfo;
    }


}
