// Jimmy start
import java.util.ArrayList;

public class Orders {
    private int orderId;
    private String costumerName;
    private ArrayList arrayOfOrderedPizza;
    private String timeStamp;
    private String deliveryTime;

    public Orders(int orderId, String costumerName, ArrayList arrayOfOrderedPizza, String timeStamp, String deliveryTime) {
        this.orderId = orderId;
        this.costumerName = costumerName;
        this.arrayOfOrderedPizza = arrayOfOrderedPizza;
        this.timeStamp = timeStamp;
        this.deliveryTime = deliveryTime;
    }


    // Theis
    @Override
    public String toString() {
        return "[NEWORDER]: (" +
                "orderId = " + orderId + ')'+
                "\nName: \"" + costumerName + '\"' +
                "\nOrdered pizzas: " + arrayOfOrderedPizza +
                "\nTime of order: '" + timeStamp + '\'' +
                ", Expected pickup: '" + deliveryTime + '\'' +
                ')';
    }
}
// Jimmy SLut
