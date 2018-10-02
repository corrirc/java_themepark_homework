package Rides;

public class Customer  {

    Customer customer;
    private int age;
    private int height;
    private double wallet;

    public Customer(int age, int height, double wallet){

        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return this.age;
    }


    public int getHeight() {
        return this.height;
    }

    public double getWalletAmount() {
        return this.wallet;
    }
}
