// Jimmy start
public class PizzaMenu {
    private int pizzaId;
    private String name;
    private int price;

    public PizzaMenu(int pizzaId, String name, int price) {
        this.pizzaId = pizzaId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PizzaMenu{" +
                "pizzaId=" + pizzaId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

//Jimmy slut
