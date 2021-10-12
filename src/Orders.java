import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Orders {
    private int orderId;
    private String costumerName;
    private int[] pizzaIdArray;
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

    public Orders(int orderId, String costumerName, int[] pizzaIdArray, String timeStamp, boolean orderStatus) {
        this.orderId = orderId;
        this.costumerName = costumerName;
        this.pizzaIdArray = pizzaIdArray;
        this.timeStamp = timeStamp;
        this.orderStatus = orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
        orderStatus = false;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", costumerName='" + costumerName + '\'' +
                ", pizzaIdArray=" + Arrays.toString(pizzaIdArray) +
                ", timeStamp='" + timeStamp + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
