package Ride;

public abstract class Ride {

    Customer customer;
    private int height;
    private double price;



    public Ride(int height, double price) {

        this.height = height;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public int getHeight() {
        return this.height;
    }

}
