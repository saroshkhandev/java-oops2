package vehicle;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.print();
//        v.color = "white";
//        v.setNumber(1010);
//        System.out.println(v.color + " " + v.getNumber());

        Car c = new Car(6, 250) {
            @Override
            public String getCompany() {
                return null;
            }
        };
        System.out.println("is motorized: " + c.isMotorized());

        Vehicle v = new Car(6, 250) {
            @Override
            public String getCompany() {
                return null;
            }
        };

        v.print();


/*
        Car c;
        System.out.println(c);
*/
//        c.numGears = 6;
//        c.color = "Black";
//        c.print();

    }

}
