package interfaces;

public class Car extends Vehicle implements VehicleInterface {
    @Override
    public void print() {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String getCompany() {
        return null;
    }
}
