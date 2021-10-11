import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input pizza id:");
        String pizzaId = scanner.nextLine();
        int newPizzaId = Integer.parseInt(pizzaId);
        System.out.println("please input pizza price:");
        String pizzaPrice = scanner.nextLine();
        int newPizzaPrice = Integer.parseInt(pizzaPrice);
        System.out.println("please input pizza name:");
        String name = scanner.nextLine();

        Orders pizza = new Orders(newPizzaId,newPizzaPrice,name);

        System.out.println(pizza);
    }
}
