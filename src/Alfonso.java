public class Alfonso{

    public Orders createOrder;
    //variables
    private int orderID;
    private String customerName;
    private PizzaMenu[] arrayOfOrderedPizza;
    private String timeOfOrder;
    private String deliveryTime;
    private boolean orderStatus;
    private int quantity;
    private int p1;


    //Constructor
    public Alfonso() {
    }

  /*  private PizzaMenu[] pizzaAdder(){
        return
    }*/


    public Orders createOrder(int orderID, String customerName, PizzaMenu[] arrayOfOrderedPizza, String timeOfOrder, String deliveryTime, boolean orderStatus){
        this.orderID++;
        return new Orders(orderID, customerName, arrayOfOrderedPizza, timeOfOrder, deliveryTime, orderStatus);
    }

    public void removeOrder(boolean orderStatus){
        this.orderStatus = false;

    }

    @Override
    public String toString() {
        return "Alfonso{" +
                "createOrder=" + createOrder +
                '}';
    }
}
