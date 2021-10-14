import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static boolean continueLoop = true;
    private static String userInput = "";
    private static Scanner scan = new Scanner(System.in);
    private static int idOfOrder = 0;
    private static ArrayList<Orders> ordersForMario = new ArrayList();
    //Pizza objects
    private static PizzaMenu p1 = new PizzaMenu(1,"Vesuvio","tomato","cheese","skinke","oregano");
    private static PizzaMenu p2 = new PizzaMenu(2,"Amerikaner","tomato","cheese", "oksefars","oregano");
    private static PizzaMenu p3 = new PizzaMenu(3,"Cacciatore","tomato","cheese", "pepperoni","oregano");
    private static PizzaMenu p4 = new PizzaMenu(4,"Bertil","tomato","cheese", "bacon","oregano");
    private static PizzaMenu[] arrayOfPizzas = {p1,p2,p3,p4};



    public static void initializer(){
        System.out.println("\t=PIZZABIKS=\n" +
                "_____________________\n" +
                "Who is operating the machine?");
        System.out.println("1.\t Mario\n"+"2.\t Alfonso\n"+"3.\t Quit");

        do{
            userInput = scan.nextLine();
            switch(userInput){
                case "1":
                    marioMenu();
                    break;
                case "2":
                    alfonsoMenu();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid input.");
            }

        }while(continueLoop);
    }

    public static void marioMenu(){
        System.out.println("\t=MARIO MENU=");
        do{
            System.out.println("_____________________\n1.\t Check Menu\n"+"2.\t Check Orders\n"+"3.\t Log off");
            userInput = scan.nextLine();
            switch(userInput){
                case "1":
                    menuPrinter();
                    break;
                case "2":
                    System.out.println(ordersForMario);
                    break;
                case "3":
                    initializer();
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }

        }while(continueLoop);
    }

    public static void alfonsoMenu(){
        System.out.println("\t=ALFONSO MENU=");
        do{
            System.out.println("_____________________\n1.\t New order\n"+"2.\t Remove order\n"+"3.\t Log off");
            userInput = scan.nextLine();
            switch(userInput){
                case "1":
                    createNewOrder();
                    break;
                case "2":
                    System.out.println(ordersForMario);
                    removeOrder();
                    break;
                case "3":
                    initializer();
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }

        }while(continueLoop);
    }

    public static void menuPrinter(){
        System.out.println("\t==MENU==");
        for (int i = 0; i < arrayOfPizzas.length; i++) {
            System.out.println(arrayOfPizzas[i]);
        }
    }

    public static void addOrdersForMario(Orders orderToAdd){
        ordersForMario.add(orderToAdd);
    }

    public static void createNewOrder(){
        System.out.println("==ORDER CREATION==");
        System.out.println("Name of the person ordering:");
        String nameOfCustomer = scan.nextLine();
        System.out.println("Choose amount of pizzas: ");
        int amountOfPizzas = scan.nextInt();

        ArrayList<PizzaMenu> chosenPizzaArray = new ArrayList();

        System.out.println("What pizza(s) would the costumer like? ");
        //printing out menu
        menuPrinter();
        //loop to choose pizzas
        for (int i = 1; i <= amountOfPizzas; i++) {
            PizzaMenu chosenPizza = arrayOfPizzas[scan.nextInt()-1];
            chosenPizzaArray.add(chosenPizza);
            System.out.println("You've chosen: "+chosenPizza);
        }
        scan.nextLine();
        idOfOrder++;
        Orders customerOrder = new Orders(idOfOrder,nameOfCustomer,chosenPizzaArray,pizzaTimestamp(),"10",true);
        addOrdersForMario(customerOrder);
    }

    public static void removeOrder(){
        int orderToRemove;
        System.out.println("==ORDER REMOVAL==\n" +
                "_____________");
        System.out.println("What order do you want removed?");
        orderToRemove = scan.nextInt()-1;//minus med en for at komme på indexets plads
        scan.nextLine();
        ordersForMario.get(orderToRemove).setOrderStatusToDelivered(); // Kodet af jimmy
        System.out.println("Order has been removed");
    }

    // Sammen arbejde mellem Tobias og Jimmy
    public static String pizzaTimestamp() {
        String timeStamp;
        //https://www.javatpoint.com/java-get-current-date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        timeStamp = dtf.format(now);
        return timeStamp;
    }
    // Sammen arbejde slut


    public static void main(String[] args) {


        initializer();

        System.out.println(ordersForMario);


    }

}
