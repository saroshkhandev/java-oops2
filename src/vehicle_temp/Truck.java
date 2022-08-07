package vehicle_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;
    public Truck(int maxSpeed) {
        super(maxSpeed);
        System.out.println("Truck Constructor");
    }
    public void print(){
        System.out.println("Truck capacity: " + maxLoadingCapacity);
        System.out.println("Truck color: " + color);
        System.out.println("Truck speed: " + getMaxSpeed());
    }
}
