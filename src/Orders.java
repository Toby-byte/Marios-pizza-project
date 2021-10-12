import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Orders {
    private int orderId;
    private String costumerName;
    private String[] arrayOfOrderedPizza;
    private String timeStamp;
    private String deliveryTime;
    private boolean orderStatus;

    public String pizzaTimestamp() {
        String timeStamp;
        //https://www.javatpoint.com/java-get-current-date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        timeStamp = dtf.format(now);
        return timeStamp;
    }

    public Orders(int orderId, String costumerName, String[] arrayOfOrderedPizza, String timeStamp, String deliveryTime, boolean orderStatus) {
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

    public String getCostumerName() {
        return costumerName;
    }

    public String[] getPizzaNameArray() {
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
}
