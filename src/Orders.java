import java.util.Arrays;

public class Orders {
    private int orderId;
    private String costumerName;
    private PizzaMenu[] arrayOfOrderedPizza;
    private String timeStamp;
    private String deliveryTime;
    private boolean orderStatus;

    public Orders(int orderId, String costumerName, PizzaMenu[] arrayOfOrderedPizza, String timeStamp, String deliveryTime, boolean orderStatus) {
        this.orderId = orderId;
        this.costumerName = costumerName;
        this.arrayOfOrderedPizza = arrayOfOrderedPizza;
        this.timeStamp = timeStamp;
        this.deliveryTime = deliveryTime;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public int newestOrderId(int lastOrderId){
        int newestOrderId = lastOrderId;
        newestOrderId++;
        return newestOrderId;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public PizzaMenu[] getPizzaNameArray() {
        return arrayOfOrderedPizza;
    }

    public void setOrderStatusToUnactive(boolean orderStatus) {
        this.orderStatus = orderStatus;
        orderStatus = false;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", costumerName='" + costumerName + '\'' +
                ", arrayOfOrderedPizza=" + Arrays.toString(arrayOfOrderedPizza) +
                ", timeStamp='" + timeStamp + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }

    /*
    boolean loopForTheEntireShift = true;
        List<Orders> orders = new ArrayList<>();
        int i = 0;
        do{
            i++;
            orders.add(new Orders(i,"Kim", testarray, "nu", "nu", true));
        }
        while(!loopForTheEntireShift);
     */
}
