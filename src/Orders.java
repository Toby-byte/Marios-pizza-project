import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Orders {
    int pizzaId;
    int pizzaPrice;
    String name;

    public void pizzaTimestamp() {
        //https://www.javatpoint.com/java-get-current-date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public Orders(int pizzaId, int pizzaPrice, String name) {
        this.pizzaId = pizzaId;
        this.pizzaPrice = pizzaPrice;
        this.name = name;
        pizzaTimestamp();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "pizzaId=" + pizzaId +
                ", pizzaPrice=" + pizzaPrice +
                ", name='" + name + '\'' +
                '}';
    }
}
