package vehicle;

public class BMW extends Car{

    public BMW(int numGears, int maxSpeed) {
        super(numGears, maxSpeed);
    }

    @Override
    public String getCompany() {
        return "BMW";
    }
}
