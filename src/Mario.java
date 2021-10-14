public class Mario {
    public static void main(String[] args) {
        PizzaMenu p1 = new PizzaMenu(1,"Vesuvio","tomato","cheese","skinke","oregano");
        PizzaMenu p2 = new PizzaMenu(2,"Amerikaner","tomato","cheese", "oksefars","oregano");
        PizzaMenu p3 = new PizzaMenu(3,"Cacciatore","tomato","cheese", "pepperoni","oregano");
        PizzaMenu p4 = new PizzaMenu(4,"Bertil","tomato","cheese", "bacon","oregano");

        PizzaMenu[] pizzas = {p1,p2,p3,p4};

        for (int i = 0; i < 4; i++) {
            System.out.println(pizzas[i]);
        }
    }
}
