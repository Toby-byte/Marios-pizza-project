import java.util.ArrayList;
import java.util.Scanner;

public class PutPizzaInArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaMenu p1 = new PizzaMenu(1,"Vesuvio","tomato","cheese","skinke","oregano");
        PizzaMenu p2 = new PizzaMenu(2,"Amerikaner","tomato","cheese", "oksefars","oregano");
        PizzaMenu p3 = new PizzaMenu(3,"Cacciatore","tomato","cheese", "pepperoni","oregano");
        PizzaMenu p4 = new PizzaMenu(4,"Bertil","tomato","cheese", "bacon","oregano");

        ArrayList<PizzaMenu> pizzaList = new ArrayList<>();
        while (true) {
            System.out.println("what pizzas would you like to order? p1,p2,p3 or p4");
            String userinput = scanner.nextLine();
            if (userinput.equals("p1")) {
                pizzaList.add(p1);
            } else if (userinput.equals("p2")) {
                pizzaList.add(p2);
            } else if (userinput.equals("p3")) {
                pizzaList.add(p3);
            } else if (userinput.equals("p4")) {
                pizzaList.add(p4);
            } else if (userinput.equals("exit")) {
                return;
            }
            System.out.println(pizzaList);
        }



    }
}
