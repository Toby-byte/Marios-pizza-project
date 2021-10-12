public class PizzaMenu {
    private String name;
    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;

    public PizzaMenu(String name, String topping1, String topping2, String topping3, String topping4) {
        this.name = name;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
    }

    PizzaMenu p1 = new PizzaMenu("Vesuvio","tomato","cheese","skinke","oregano");
    PizzaMenu p2 = new PizzaMenu("Amerikaner","tomato","cheese", "oksefars","oregano");
    PizzaMenu p3 = new PizzaMenu("Cacciatore","tomato","cheese", "pepperoni","oregano");
    PizzaMenu p4 = new PizzaMenu("Bertil","tomato","cheese", "bacon","oregano");

    @Override
    public String toString() {
        return "PizzaMenu{" +
                "name='" + name + '\'' +
                ", topping1='" + topping1 + '\'' +
                ", topping2='" + topping2 + '\'' +
                ", topping3='" + topping3 + '\'' +
                ", topping4='" + topping4 + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }
}
