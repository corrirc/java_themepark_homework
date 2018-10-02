package Ride;

public abstract class Ride {

    private String name;
    private int height;
    private double price;

    public Ride(String name, int height, double price);{
        this.name = name;
        this.height = height;
        this.price = price;
    }

    public String getRideName(){
        return this.name;
    }

    public int getRideHeight(){
        return this.height;
    }

    public double getRidePrice(){
        return this.price;
    }
}
