public class Customer extends Ride {

    private String name;
    private int age;
    private int height;
    private double price;
    private double wallet;

    public Customer(String name, int age, int height, double price, double wallet){
        super(name, age, height, price);
        this.wallet = wallet;
    }

}
