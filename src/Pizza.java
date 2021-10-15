import java.util.Scanner;

public class Pizza { // kode af Tobias start
    private String name;
    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;
    private int pizzaNumber;

    public Pizza(int pizzaNumber, String name, String topping1, String topping2, String topping3, String topping4) {
        this.pizzaNumber = pizzaNumber;
        this.name = name;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
    } // // kode af Tobias slut

    @Override
    public String toString() {
        return "\nNumber: \'"+pizzaNumber+'\''+
                " | Name: \'" + name + '\'' +
                ")";
    }

}
