import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Orders {
    private int orderId;
    private String costumerName;
    private String[] pizzaNameArray;
    private String timeStamp;
    private boolean orderStatus;

    public String pizzaTimestamp() {
        String timeStamp;
        //https://www.javatpoint.com/java-get-current-date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        timeStamp = dtf.format(now);
        return timeStamp;
    }

    public Orders(int orderId, String costumerName, String[] pizzaNameArray, String timeStamp, boolean orderStatus) {
        this.orderId = orderId;
        this.costumerName = costumerName;
        this.pizzaNameArray = pizzaNameArray;
        this.timeStamp = timeStamp;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public String[] getPizzaNameArray() {
        return pizzaNameArray;
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
                ", pizzaIdArray=" + Arrays.toString(pizzaNameArray) +
                ", timeStamp='" + timeStamp + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
