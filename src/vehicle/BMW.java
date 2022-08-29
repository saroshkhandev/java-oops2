package vehicle;

public class BMW extends Car{

    public BMW(int numGears, int maxSpeed) {
        super(numGears, maxSpeed);
    }

    @Override
    public boolean isMotorized() {
        return super.isMotorized();
    }

    @Override
    public String getCompany() {
        return "BMW";
    }
}
