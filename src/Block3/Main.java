package Block3;

import static Block3.ServiceStation.check;

public class Main {

    public static void main(String[] args) {
        Car a1 = new Car("BMW", 4);
        Bicycle a2 = new Bicycle("Vela", 2);
        Truck a3 = new Truck("MAN", 10);



        System.out.println(check(null, a2, a3));

    }
}
