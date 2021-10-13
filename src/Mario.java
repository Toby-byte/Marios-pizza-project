public class Mario {
    public static void main(String[] args) {
        PizzaMenu p1 = new PizzaMenu("Vesuvio","tomato","cheese","skinke","oregano");
        PizzaMenu p2 = new PizzaMenu("Amerikaner","tomato","cheese", "oksefars","oregano");
        PizzaMenu p3 = new PizzaMenu("Cacciatore","tomato","cheese", "pepperoni","oregano");
        PizzaMenu p4 = new PizzaMenu("Bertil","tomato","cheese", "bacon","oregano");

        PizzaMenu[] pizzas = {p1,p2,p3,p4};

        for (int i = 0; i < 4; i++) {
            System.out.println(pizzas[i]);
        }
    }
}
