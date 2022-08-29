package vehicle;

public abstract class Vehicle {
//    private Vehicle(){
//        System.out.println("constructor of Vehicle");
//    } this will give compilation error.

    protected String color;
//    private int number;
//
//    public void setNumber(int number) {
//        number = number;
//    }
//
//    public int getNumber() {
//        return number;
//    }

    private int maxSpeed;

    public abstract boolean isMotorized();
    public abstract String getCompany();

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle maxSpeed: " + maxSpeed);
    }
}
