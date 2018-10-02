package Ride;

public abstract class Ride {

    private String rideName;
    private int rideHeight;
    private double ridePrice;

    public Ride(String rideName, int rideHeight, double ridePrice);{
        this.rideName = rideName;
        this.rideHeight = rideHeight;
        this.ridePrice = ridePrice;
    }

    public String getRideName(){
        return this.rideName;
    }

    public int getRideHeight(){
        return this.rideHeight;
    }

    public double getRidePrice(){
        return this.ridePrice;
    }
}
