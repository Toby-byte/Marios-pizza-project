public class Test_class {
String nameId;
    String topping1;
    String topping2;
    String topping3;
    String topping4;

    public Test_class(String nameId, String topping1, String topping2, String topping3, String topping4) {
        this.nameId = nameId;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
    }

    public static void main(String[] args) {
        Test_class v1 = new Test_class("1","tomato","cheese","skinke","oregano");
        Test_class v2 = new Test_class("3","tomato","cheese", "jkfdj","fjgkf");
    }
}
