package Block2;

public class Main {
    public static void main(String[] args) {
        Car a1 = new SportCar ("BMW", 8, 40);
        Car a2 = new Truck("MAN", 8, 20000);
        a1.updateTyre();
        a2.checkEngine();
        a1.fillFuel("Последовательный", 20, 100);
        a2.fillFuel("Дизель", 600);
    }
}
