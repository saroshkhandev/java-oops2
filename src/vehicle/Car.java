package vehicle;

public abstract class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public Car(int numGears, int maxSpeed) {
        super(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }

    @Override
    public boolean isMotorized() {
        return false;
    }


    public boolean isConvertible() {
        return isConvertible;
    }

    public void print() {
        super.print();
//        System.out.println("Car Color: " + color);
//        System.out.println("Car maxSpeed: " + getMaxSpeed());
        System.out.println("Car number of Gears: " + numGears);
        System.out.println("Car is convertible: " + isConvertible);
    }
}
