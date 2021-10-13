import java.util.Arrays;

public class Orders {
    private String costumerName;
    private PizzaMenu[] arrayOfOrderedPizza;
    private String timeStamp;
    private String deliveryTime;
    private boolean orderStatus;

    public Orders(String costumerName, PizzaMenu[] arrayOfOrderedPizza, String timeStamp, String deliveryTime, boolean orderStatus) {
        this.costumerName = costumerName;
        this.arrayOfOrderedPizza = arrayOfOrderedPizza;
        this.timeStamp = timeStamp;
        this.deliveryTime = deliveryTime;
        this.orderStatus = orderStatus;
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
                ", costumerName='" + costumerName + '\'' +
                ", arrayOfOrderedPizza=" + Arrays.toString(arrayOfOrderedPizza) +
                ", timeStamp='" + timeStamp + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
