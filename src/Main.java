public class Main {
    public static void main(String[] args) {
        PizzaMenu p1 = new PizzaMenu("Vesuvio","tomato","cheese","skinke","oregano");
        PizzaMenu p2 = new PizzaMenu("Amerikaner","tomato","cheese", "oksefars","oregano");
        PizzaMenu p3 = new PizzaMenu("Cacciatore","tomato","cheese", "pepperoni","oregano");
        PizzaMenu p4 = new PizzaMenu("Bertil","tomato","cheese", "bacon","oregano");

        PizzaMenu[] tesarray = {p1,p2};
        Orders test = new Orders(1,"Kim",tesarray, "nu", "nu", true);
        System.out.println(test.newestOrderId(test.getOrderId()));

    }
}
