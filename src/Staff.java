public class Staff implements IStaffDuties {
    private String name;
    private int id;
    private String position;





    public Staff(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }



    @Override
    public void purchase(double bill) {
        System.out.println("Staff restocks products");
    }


    public void fire() {
        System.out.println("no information on who fired who");
    }


    public void hire(String name, int age, String gender ) {


    }
//create getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }
//create methods
  public  Manager getManager () {
        return new Manager();
  }

  public Cashier getCashier () {
        return new Cashier();
  }

}


    class Manager extends Staff {

//create a constructor
        public Manager() {
            super("Rose", 10, "Manager");

        }


//create methods
        @Override
        public void hire(String name, int age, String gender ) {

        }

        @Override
        public void fire() {
            System.out.println("Manager fired a staff");

        }

    }

    class Cashier extends Staff {
        public Cashier() {
            super("Femi", 20, "Cashier");
        }


        //create methods
        public void printReceipt() {
            System.out.println("Printing receipt");
        }

        public void recordSales() {
            System.out.println("Purchase processed");
        }


        @Override
        public void fire() {
            System.out.println("Cashier got fired by Manager");
        }
    }
