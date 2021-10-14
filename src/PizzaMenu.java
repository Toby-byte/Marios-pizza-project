import java.util.Scanner;

public class PizzaMenu {
    private Scanner scan = new Scanner(System.in);
    private String name;
    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;

    private int pizzaNumber;

    public PizzaMenu(int pizzaNumber, String name, String topping1, String topping2, String topping3, String topping4) {
        this.pizzaNumber = pizzaNumber;
        this.name = name;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
    }

    /*private PizzaMenu p1 = new PizzaMenu(1,"Vesuvio","tomato","cheese","skinke","oregano");
    private PizzaMenu p2 = new PizzaMenu(2,"Amerikaner","tomato","cheese", "oksefars","oregano");
    private PizzaMenu p3 = new PizzaMenu(3,"Cacciatore","tomato","cheese", "pepperoni","oregano");
    private PizzaMenu p4 = new PizzaMenu(4,"Bertil","tomato","cheese", "bacon","oregano");
    private PizzaMenu[] arrayOfPizzas = {p1,p2,p3,p4};*/

    public void printMenu(){
        System.out.println(
                "1.\t\tVesuvio\n"+
                "2.\t\tAmerikaner" +
                "3.\t\tCacciatore" +
                "4.\t\tBertil"
        );
    }

    /*public void createPizza(){
        System.out.println("Choose amount of pizzas: ");
        int amountOfPizzas = scan.nextInt();

        System.out.println("What pizza(s) would the costumer like? ");
        //printing out menu
        for (int i = 0; i < arrayOfPizzas.length; i++) {
            System.out.println(arrayOfPizzas[i]);
        }
        //loop to choose pizzas
        for (int i = 1; i <= amountOfPizzas; i++) {
            PizzaMenu chosenPizza = arrayOfPizzas[scan.nextInt()];
            System.out.println("You've chosen: "+chosenPizza);
        }

    }*/

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nNumber: \'"+pizzaNumber+'\''+
                " | Name: \'" + name + '\'' +
                ")";
    }
}
